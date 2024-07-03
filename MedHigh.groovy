// code here
import eu.mihosoft.vrl.v3d.ChamferedCube
import eu.mihosoft.vrl.v3d.Cube
int ox = 250;
int oy= 250;
int oz = 250;
int outCham = 15
int inx = 200 
int iny = 200
int inz = 200

CSG outCasing = new ChamferedCube(
	ox,// X 
	oy, // Y
	oz, // Z
	 outCham// Chamfer length
	).toCSG()
CSG inCase = new Cube(inx,iny,inz).toCSG()
return [outCasing,inCase]

	
	
	