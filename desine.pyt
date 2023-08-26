from turtle import*
bgcolor('black')
speed(0)
hideturtle()
for i in range(250):
    color('red');
    circle(i)
    color('white')
    circle(i*0.1)
    right(5)
    forward(3)
for i in range(250):
    color('blue');
    circle(i)
    color('green')
    circle(i*0.8)
    right(3)
    forward(3)    
done()