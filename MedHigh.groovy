// code here
import eu.mihosoft.vrl.v3d.ChamferedCube
int ox = 250
int oy= 250
int oz = 250
int outCham = 15

CSG outCasing = new ChamferedCube(
	ox,// X 
	oy, // Y
	oz, // Z
	 outCham// Chamfer length
	).toCSG()
	
	
	