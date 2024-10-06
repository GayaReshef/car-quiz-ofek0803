public class CarInfo {
public boolean illegal (int maxSpeed) {
		if (this.speed > maxSpeed || this.privateCar == true){
			return true;
		}
	return false;
	}
}


public class CameraInfo {
public boolean allGood (CarInfo [] cars) {
	for (int i = 0; i < cars.length; i++) {
		if (cars[i].illegal (maxSpeed) == true) {
			return false;
		}
	}
	return true;
}
}


public static int legalcities (CameraInfo [] cameras) {
	int count = 0;
	boolean oneCity = true;
	for (int i = 0; i < 100; i++) {
		for (int j = 0; j< cameras.length; j++) {
			if (cameras[j].getCity() == i) {
				if (cameras[j].allGood() == true){
					oneCity = true;
				}
				else {
					oneCity = false;
				}
			}
			if (oneCity == true) {
				count++;
			}
		}
	}
return count;	
}

