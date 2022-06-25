package et.gov.moa.service;

import java.util.List;

import org.springframework.data.domain.Page;

import et.gov.moa.model.Client;

public interface ClientService {
	List<Client> getAllClients();
	List<Client> getByKeyword(String keyword);
	void saveClient(Client client);
	Client getClientById(long id);
	void deleteClientById(long id);
	Page<Client> findPaginated(int pageNo, int pageSize, String sortField, String sortDirection);
}
