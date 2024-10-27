function ConsultarCEP() {
    const cep = document.getElementById('cep').value;
    fetch(`http://localhost:8080/api/cep/${cep}`) // Corrigido o formato da URL
    .then(response => { // Corrigido o nome da variável para começar com letra minúscula
        if (!response.ok) {
            throw new Error("CEP não encontrado");
        }
        return response.json();
    })
    .then(data => {
        // Preencher a tabela com os dados
        document.getElementById('cepResultado').innerText = data.cep || 'N/A';
        document.getElementById('logradouroResultado').innerText = data.logradouro || 'N/A';
        document.getElementById('bairroResultado').innerText = data.bairro || 'N/A';
        document.getElementById('localidadeResultado').innerText = data.localidade || 'N/A';
        document.getElementById('ufResultado').innerText = data.uf || 'N/A';
    })
    .catch(error => {
        alert(error.message);
    });
}
