TEX = pdflatex
TEXFLAGS = 

.PHONY: all clean

all : main.pdf

clean :
	rm *.aux *.log *.pdf

main.pdf : src/main.tex
	$(TEX) $(TEXFLAGS) $^
