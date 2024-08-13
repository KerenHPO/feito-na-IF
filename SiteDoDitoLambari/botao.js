// Array para armazenar os itens do carrinho
let cart = [];

// Função para adicionar itens ao carrinho
function addToCart(name, price) {
    // Adiciona o item ao array do carrinho
    cart.push({ name, price });

    // Atualiza a exibição do carrinho
    updateCartDisplay();
}

// Função para atualizar a exibição do carrinho
function updateCartDisplay() {
    const cartItemsContainer = document.getElementById('cart-items');
    const totalPriceElement = document.getElementById('total-price');

    // Limpa os itens anteriores
    cartItemsContainer.innerHTML = '';

    // Variável para armazenar o preço total
    let totalPrice = 0;

    // Adiciona cada item do carrinho ao elemento de exibição
    cart.forEach(item => {
        const listItem = document.createElement('li');
        listItem.textContent = `${item.name} - R$ ${item.price.toFixed(2)}`;
        cartItemsContainer.appendChild(listItem);

        // Calcula o preço total
        totalPrice += item.price;
    });

    // Atualiza o preço total
    totalPriceElement.textContent = totalPrice.toFixed(2);
}

// Adiciona um evento de clique a todos os botões de "Adicionar ao Carrinho"
const addToCartButtons = document.querySelectorAll('.add-to-cart');
addToCartButtons.forEach(button => {
    button.addEventListener('click', function() {
        const name = this.getAttribute('data-name');
        const price = parseFloat(this.getAttribute('data-price'));
        addToCart(name, price);
    });
});

//Navegação com setas
document.querySelector('.left-nav').addEventListener('click', function() {
    document.querySelector('.pratos').scrollBy({
        left: -250,
        behavior: 'smooth'
    });
});

document.querySelector('.right-nav').addEventListener('click', function() {
    document.querySelector('.pratos').scrollBy({
        left: 250,
        behavior: 'smooth'
    });
});