import uuid

# Drawback of uuid1() :
# This way includes the used of MAC address of computer, and hence can
# compromise the privacy, even though it provides uniquenes.

# Using uuid4()
# This function guarantees the random no. and doesn’t compromise with privacy.

for x in range(10):
    id = uuid.uuid4()
    print (id.hex)
