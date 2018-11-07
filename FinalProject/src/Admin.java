public class Admin extends User implements AdminOperations {

	public Admin(int id, String firstName, String lastName, String email, String password) {
		super(id, firstName, lastName, email, password);
	}

	@Override
	public void addRestaurant() {
		// TODO Auto-generated method stub
	}

	@Override
	public void getRestaurant(int restaurantId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateRestaurant(int restaurantId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteRestaurant(int restaurantId) {
		// TODO Auto-generated method stub
		
	}
}
