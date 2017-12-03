DESCRIPTION = "RaspberryPi Qt5 Packagegroup"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

inherit packagegroup

COMPATIBLE_MACHINE = "^rpi$"

RDEPENDS_${PN} = "\
	cinematicexperience \
	qtsmarthome \
	\
	qtbase \
	qtbase-plugins \
	qtbase-tools \
	qtmultimedia \
	qtmultimedia-plugins \
	qtmultimedia-qmlplugins \
	qtsvg \
	qtsvg-plugins \
	qtsensors \
	qtsensors-plugins \
	qtsystems \
	qtsystems-tools \
	qtsystems-qmlplugins \
	qt3d \
	qtscript \
	qtgraphicaleffects \
	qtgraphicaleffects-qmlplugins \
	qtconnectivity-qmlplugins \
	qtlocation-plugins \
	qtlocation-qmlplugins \
	qtdeclarative \
	qtdeclarative-qmlplugins \
	qtvirtualkeyboard \
"

