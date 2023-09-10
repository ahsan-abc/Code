import turtle
#class  in turtle module -> 1.Turtle(cursor) , 2.Screen(background)

tu = turtle.Turtle()   #for cursor
wn = turtle.Screen()   # for window (screen)
'''1. wn.title("Ahsan app")  #window title
tu.shape("circle")   # cursor shape
tu.color("black","red") # cursor line color , background

wn.colormode(255)        colormode 255 use for we want to use rgb color code 
wn.bgcolor(18,207,254)  # screen background color in rgb


wn.bgpic("bbc.gif") # set background photo (must in gif)'''


'''2. tu.shape("turtle")
tu.setheading(270) # change direction of cursor (0->(east) , 90->(north0 , 180->(west) , 270->(south))

tu.forward(70)    # for 70 pixel forward movement (also fd())
tu.backward(140)      # for 70 pixel back movemnet (also back())

tu.left(70)       # for 70  degre left turn
tu.right(140)     # for 70 degre right turn '''


'''
3. tu.begin_fill() # start filling color
tu.fillcolor("green") # set fill color 
tu.forward(100)
tu.setheading(90)
tu.forward(70)
tu.setheading (180)
tu.forward(100)
tu.setheading(270)
tu.forward(70)

tu.end_fill() # end filling color
tu.fillcolor("geeen")

tu.hideturtle() # for hiding turtle
tu.speed(0)   # set speed of the turtle (0->faster ,10->fast ,6->normal ,3->slow ,1->slowest)
'''

'''
tu.circle(100) # draw a circle , (radius ,  extent=None, steps=None), steps means no of side (3 means traingale)
tu.undo()  # for undo
tu.reset() # all clear
tu.goto(0,-100) # for set potion of the circle
tu.up()   # stop draw line
tu.down  # start draw line '''





























