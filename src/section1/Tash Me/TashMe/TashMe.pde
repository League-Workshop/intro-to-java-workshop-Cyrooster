PImage mustache;

PImage face;
void setup(){
  face = loadImage("face.png");
mustache = loadImage("mustache.png");
size(800, 800);

face.resize(width,height);
  mustache.resize(300,210);
}
void draw(){
  background(face);
   image(mustache, mouseX, mouseY);
  if(mousePressed)
}