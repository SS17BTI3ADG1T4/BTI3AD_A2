TEX = pdflatex
TEXFLAGS = -interaction=nonstopmode 

.PHONY: all clean

all : main.pdf

clean :
	rm -f *.aux *.log *.toc *.lof *.lot *.toc

main.pdf : src/main.tex main.lof main.lot main.toc *.dat
	$(TEX) $(TEXFLAGS) $^

main.lof main.lot main.toc : src/main.tex
	$(TEX) $(TEXFLAGS) $^
