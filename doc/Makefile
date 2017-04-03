TEX = pdflatex
TEXFLAGS = 

.PHONY: all clean

all : main.pdf

clean :
	rm -f *.aux *.log *.pdf *.toc

main.pdf : src/main.tex
	$(TEX) $(TEXFLAGS) $^
