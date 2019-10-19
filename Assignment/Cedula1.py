if __name__ == '__main__':
	resp = float()
	resp1 = float()
	impares = int()
	pares = int()
	total = int()
	a, c, e,g,i,a1,b,c1,d,f,h,j,k,l,a10,a1 = int()
	a1 = int(input())
	b = int(input())
	c1 = int(input())
	d = int(input())
	f = int(input())
	h = int(input())
	j = int(input())
	k = int(input())
	l = int(input())
	a10 = int(input())
	a = a1*2
	if (a>9):
		a = a-9
	c = c1*2
	if (c>9):
		c = c-9
	e = f*2
	if (e>9):
		e = e-9
	g = j*2
	if (g>9):
		g = g-9
	i = l*2
	if (i>9):
		i = i-9
	impares = a+c+e+g+i
	pares = b+d+h+k
	total = pares+impares
	resp1 = total%10
	if resp1==0:
		print("Cedula Valida")
	else:
		if resp1>=1:
			resp = 10-resp1
	print("Su cedula termina en: ",resp," Por tanto es Valida")

