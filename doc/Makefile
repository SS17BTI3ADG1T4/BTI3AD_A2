TEX = pdflatex
TEXFLAGS = 

.PHONY: all clean

all : main.pdf

clean :
	rm -f *.aux *.log *.toc

main.pdf : src/main.tex main.toc
	$(TEX) $(TEXFLAGS) $^

main.toc : src/main.tex
	$(TEX) $(TEXFLAGS) $^
