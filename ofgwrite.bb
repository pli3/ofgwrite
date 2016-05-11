DESCRIPTION = "Tools for managing memory technology devices."
LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://COPYING;md5=0636e73ff0215e8d672dc4c32c317bb3 \
                    file://include/common.h;beginline=1;endline=17;md5=ba05b07912a44ea2bf81ce409380049c"

S = "${FILE_DIRNAME}/"
WORKDIR = "${S}/build/"

PR = "r0"

EXTRA_OEMAKE = "'CC=${CC}' 'RANLIB=${RANLIB}' 'AR=${AR}' 'CFLAGS=${CFLAGS} -I${S}include -I${S}ubi-utils/include -I${S}busybox/include -DWITHOUT_XATTR -D_FILE_OFFSET_BITS=64 -D_GNU_SOURCE' 'BUILDDIR=${S}'"

