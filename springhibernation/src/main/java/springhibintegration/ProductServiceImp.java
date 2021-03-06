package springhibintegration;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ProductServiceImp implements ProductService{

	@Autowired
	private EProductDAO eproductDAO;
	
	public List<EProductEntity> getAllProducts() {
		return eproductDAO.getAllProducts();
	}

}