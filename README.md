## Export files for ETSI APIs

### Commands used to extract ETSI 131.130

```
for f in ../131.130/*/*.zip; do patool extract $f; done
mmv -r 'ts_131130v??????p0' '131.130-#1#2.#3#4.#5#6'
# javadoc
for d in 131.130-*; do pushd $d; unzip *_Annex_A_HTML.zip; popd; done
for d in 131.130-*; do pushd $d; mv *_Annex_A_HTML javadoc; popd; done
for d in 131.130-14.02.01 131.130-15.02.02 131.130-15.03.00 131.130-16.00.00; do
pushd $d; mkdir javadoc; mv *.html *.js *.css package-list uicc javadoc/; popd;
done
# java
for d in 131.130-*; do pushd $d; unzip *_Annex_A_[Jj]ava.zip; popd; done
for d in 131.130-*; do pushd $d; mv *_Annex_A_[Jj]ava java; popd; done
for d in 131.130-*; do pushd $d; if [ -d uicc ]; then mkdir java; mv uicc java/; fi; popd; done
# exports
for d in 131.130-*; do pushd $d; unzip *_Annex_B_Export_[Ff]iles.zip; popd; done
for d in 131.130-*; do pushd $d; mv *_Annex_B_Export_[Ff]iles exports; popd; done
for d in 131.130-*; do pushd $d; if [ -d uicc ]; then mkdir exports; mv uicc exports/; fi; popd; done
# jar
for d in 131.130-*; do pushd $d; mv *.jar usim-api.jar; popd; done
# add to git
for d in 131.130-*; do pushd $d; git add exports java javadoc *.jar; popd; done
# add stray java files
git add 131.130-*/*.java
```

### Commands used to extract ETSI 131.133

```
for f in ../131.133/*/*.zip; do patool extract $f; done
mmv -r 'ts_131133v??????p0' '131.133-#1#2.#3#4.#5#6'
# javadoc
for d in 131.133-*; do pushd $d; unzip *_Annex_A_HTML.zip; popd; done
for d in 131.133-*; do pushd $d; mv *_Annex_A_HTML javadoc; popd; done
# java
for d in 131.133-*; do pushd $d; unzip *_Annex_A_[Jj]ava.zip; popd; done
for d in 131.133-*; do pushd $d; mv *_Annex_A_[Jj]ava java; popd; done
# exports
for d in 131.133-*; do pushd $d; unzip *_Annex_B_Export_[Ff]iles.zip; popd; done
for d in 131.133-*; do pushd $d; mv *_Annex_B_Export_[Ff]iles exports; popd; done
# jar
for d in 131.133-*; do pushd $d; mv *.jar isim-api.jar; popd; done
# add to git
for d in 131.133-*; do pushd $d; git add exports java javadoc *.jar; popd; done
```

### Commands used to extract ETSI 143.019

```
for f in ../143.019/*/*.zip; do patool extract $f; done
mmv -r 'ts_143019v??????p0' '143.019-#1#2.#3#4.#5#6'
# javadoc
for d in 143.019-0*; do pushd $d; unzip Annex_A_HTML.zip; popd; done
for d in 143.019-0*; do pushd $d; mv Annex_A_HTML javadoc; popd; done
# java
for d in 143.019-0*; do pushd $d; unzip Annex_A_[Jj]ava.zip; popd; done
for d in 143.019-0*; do pushd $d; mv Annex_A_[Jj]ava java; popd; done
# exports
for d in 143.019-0*; do pushd $d; unzip Annex_B_Export_[Ff]iles.zip; popd; done
for d in 143.019-0*; do pushd $d; mv Annex_B_Export_[Ff]iles exports; popd; done
# remove junk
find . -type d -name CVS -exec rmdir '{}' ';'
find . -mindepth 2 -maxdepth 2 -type d -name 'Annex_*' -exec rm -rf '{}' ';'
# add to git
for d in 143.019-0*; do pushd $d; git add exports java javadoc; popd; done
```
