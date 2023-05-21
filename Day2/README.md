**DAY 2:**
**TOPIC:** Stream API

The Stream API is used to process collections of objects. A stream is a sequence of objects that supports various methods which can be pipelined to produce the desired result.


The features of Java stream are:

-> A stream is not a data structure instead it takes input from the Collections, Arrays, or I/O channels.

-> Streams don’t change the original data structure, they only provide the result as per the pipelined methods.

Operations On Stream API:

**1. map:** The map method is used to return a stream consisting of the results of applying the given function to the elements of this stream.
List number = Arrays.asList(2,3,4,5,6,7);
List square = number.stream().map(x->x*x).collect(Collectors.toList());

**2. filter:** The filter method is used to select elements as per the Predicate passed as argument.
List names = Arrays.asList("Reflection","Collection","Stream");
List result = names.stream().filter(s->s.startsWith("S")).collect(Collectors.toList());

**3. sorted:** The sorted method is used to sort the stream.
List names = Arrays.asList("Reflection","Collection","Stream");
List result = names.stream().sorted().collect(Collectors.toList());
