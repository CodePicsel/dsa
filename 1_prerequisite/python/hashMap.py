
#----------------------------{ Synopsis of HashMaping in Csharp }----------------------------

# Create: d = {} or dict()
# Add/Update: d[key] = value
# Get: d[key] (KeyError) or d.get(key, default)
# Contains: key in d
# Remove: d.pop(key) or del d[key]
# Count: len(d)
# Keys/Values/Items: d.keys(), d.values(), d.items()
# Clear: d.clear()
# Update/merge: d.update(other_dict)
# Default-setting: d.setdefault(key, default)

#*/

#Defining maps...
d={}

#dding elements...
d["banana"]=5
d.update({'b':2})

#Printing Methods...
print(d.get("apple", 4)) 
print("banana" in d) #returns boolean
for k, v in d.items():
    print(k,"=>",v)


#Deletions Methods...
# d.pop("elppa") #returns error if key dosnt exist.
# del d["l"]  #returns error if key dosnt exist.
print(len(d))

