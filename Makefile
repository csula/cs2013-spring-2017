# generates .html and .pdf version of the syllabus

SRC  = SYLLABUS.md
PDF  = SYLLABUS.pdf
HTML = SYLLABUS.html

default:
	pandoc $(SRC) -o $(HTML)
	pandoc $(SRC) -o $(PDF)

clean:
	/bin/rm -f $(PDF) $(HTML)
