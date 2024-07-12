// code here
import eu.mihosoft.vrl.v3d.ChamferedCube
import eu.mihosoft.vrl.v3d.Cube

int ox = 250
int oy = 250
int oz = 250
int outCham = 15
int inx = 200
int iny = 200
int inz = 200
int compx = 100
int compy = iny-(oy/iny)
int compz = 80


CSG outCasing = new ChamferedCube(
    ox, // X 
    oy, // Y
    oz, // Z
    outCham // Chamfer length
).toCSG().movez(oz / 2)

CSG inCase = new Cube(inx, iny, inz).toCSG().movez(inz / 2)
CSG casing = outCasing.difference(inCase)
CSG openCompartment  =  new Cube(compx,compy,compz).toCSG().movez(inx/3).movex(ox/2)
CSG shell =casing.difference(openCompartment)



return shell
