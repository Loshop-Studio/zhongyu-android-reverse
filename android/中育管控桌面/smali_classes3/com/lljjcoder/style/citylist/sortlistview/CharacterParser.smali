.class public Lcom/lljjcoder/style/citylist/sortlistview/CharacterParser;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static characterParser:Lcom/lljjcoder/style/citylist/sortlistview/CharacterParser;

.field public static pystr:[Ljava/lang/String;

.field private static pyvalue:[I


# instance fields
.field private buffer:Ljava/lang/StringBuilder;

.field private resource:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const/16 v0, 0x18c

    .line 1
    new-array v1, v0, [I

    fill-array-data v1, :array_0

    sput-object v1, Lcom/lljjcoder/style/citylist/sortlistview/CharacterParser;->pyvalue:[I

    .line 2
    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "a"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "ai"

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const-string v1, "an"

    const/4 v2, 0x2

    aput-object v1, v0, v2

    const-string v1, "ang"

    const/4 v2, 0x3

    aput-object v1, v0, v2

    const-string v1, "ao"

    const/4 v2, 0x4

    aput-object v1, v0, v2

    const-string v1, "ba"

    const/4 v2, 0x5

    aput-object v1, v0, v2

    const-string v1, "bai"

    const/4 v2, 0x6

    aput-object v1, v0, v2

    const-string v1, "ban"

    const/4 v2, 0x7

    aput-object v1, v0, v2

    const-string v1, "bang"

    const/16 v2, 0x8

    aput-object v1, v0, v2

    const-string v1, "bao"

    const/16 v2, 0x9

    aput-object v1, v0, v2

    const-string v1, "bei"

    const/16 v2, 0xa

    aput-object v1, v0, v2

    const-string v1, "ben"

    const/16 v2, 0xb

    aput-object v1, v0, v2

    const-string v1, "beng"

    const/16 v2, 0xc

    aput-object v1, v0, v2

    const-string v1, "bi"

    const/16 v2, 0xd

    aput-object v1, v0, v2

    const-string v1, "bian"

    const/16 v2, 0xe

    aput-object v1, v0, v2

    const-string v1, "biao"

    const/16 v2, 0xf

    aput-object v1, v0, v2

    const-string v1, "bie"

    const/16 v2, 0x10

    aput-object v1, v0, v2

    const-string v1, "bin"

    const/16 v2, 0x11

    aput-object v1, v0, v2

    const-string v1, "bing"

    const/16 v2, 0x12

    aput-object v1, v0, v2

    const-string v1, "bo"

    const/16 v2, 0x13

    aput-object v1, v0, v2

    const-string v1, "bu"

    const/16 v2, 0x14

    aput-object v1, v0, v2

    const-string v1, "ca"

    const/16 v2, 0x15

    aput-object v1, v0, v2

    const-string v1, "cai"

    const/16 v2, 0x16

    aput-object v1, v0, v2

    const-string v1, "can"

    const/16 v2, 0x17

    aput-object v1, v0, v2

    const-string v1, "cang"

    const/16 v2, 0x18

    aput-object v1, v0, v2

    const-string v1, "cao"

    const/16 v2, 0x19

    aput-object v1, v0, v2

    const-string v1, "ce"

    const/16 v2, 0x1a

    aput-object v1, v0, v2

    const-string v1, "ceng"

    const/16 v2, 0x1b

    aput-object v1, v0, v2

    const-string v1, "cha"

    const/16 v2, 0x1c

    aput-object v1, v0, v2

    const-string v1, "chai"

    const/16 v2, 0x1d

    aput-object v1, v0, v2

    const-string v1, "chan"

    const/16 v2, 0x1e

    aput-object v1, v0, v2

    const-string v1, "chang"

    const/16 v2, 0x1f

    aput-object v1, v0, v2

    const-string v1, "chao"

    const/16 v2, 0x20

    aput-object v1, v0, v2

    const-string v1, "che"

    const/16 v2, 0x21

    aput-object v1, v0, v2

    const-string v1, "chen"

    const/16 v2, 0x22

    aput-object v1, v0, v2

    const-string v1, "cheng"

    const/16 v2, 0x23

    aput-object v1, v0, v2

    const-string v1, "chi"

    const/16 v2, 0x24

    aput-object v1, v0, v2

    const-string v1, "chong"

    const/16 v2, 0x25

    aput-object v1, v0, v2

    const-string v1, "chou"

    const/16 v2, 0x26

    aput-object v1, v0, v2

    const-string v1, "chu"

    const/16 v2, 0x27

    aput-object v1, v0, v2

    const-string v1, "chuai"

    const/16 v2, 0x28

    aput-object v1, v0, v2

    const-string v1, "chuan"

    const/16 v2, 0x29

    aput-object v1, v0, v2

    const-string v1, "chuang"

    const/16 v2, 0x2a

    aput-object v1, v0, v2

    const-string v1, "chui"

    const/16 v2, 0x2b

    aput-object v1, v0, v2

    const-string v1, "chun"

    const/16 v2, 0x2c

    aput-object v1, v0, v2

    const-string v1, "chuo"

    const/16 v2, 0x2d

    aput-object v1, v0, v2

    const-string v1, "ci"

    const/16 v2, 0x2e

    aput-object v1, v0, v2

    const-string v1, "cong"

    const/16 v2, 0x2f

    aput-object v1, v0, v2

    const-string v1, "cou"

    const/16 v2, 0x30

    aput-object v1, v0, v2

    const-string v1, "cu"

    const/16 v2, 0x31

    aput-object v1, v0, v2

    const-string v1, "cuan"

    const/16 v2, 0x32

    aput-object v1, v0, v2

    const-string v1, "cui"

    const/16 v2, 0x33

    aput-object v1, v0, v2

    const-string v1, "cun"

    const/16 v2, 0x34

    aput-object v1, v0, v2

    const-string v1, "cuo"

    const/16 v2, 0x35

    aput-object v1, v0, v2

    const-string v1, "da"

    const/16 v2, 0x36

    aput-object v1, v0, v2

    const-string v1, "dai"

    const/16 v2, 0x37

    aput-object v1, v0, v2

    const-string v1, "dan"

    const/16 v2, 0x38

    aput-object v1, v0, v2

    const-string v1, "dang"

    const/16 v2, 0x39

    aput-object v1, v0, v2

    const-string v1, "dao"

    const/16 v2, 0x3a

    aput-object v1, v0, v2

    const-string v1, "de"

    const/16 v2, 0x3b

    aput-object v1, v0, v2

    const-string v1, "deng"

    const/16 v2, 0x3c

    aput-object v1, v0, v2

    const-string v1, "di"

    const/16 v2, 0x3d

    aput-object v1, v0, v2

    const-string v1, "dian"

    const/16 v2, 0x3e

    aput-object v1, v0, v2

    const-string v1, "diao"

    const/16 v2, 0x3f

    aput-object v1, v0, v2

    const-string v1, "die"

    const/16 v2, 0x40

    aput-object v1, v0, v2

    const-string v1, "ding"

    const/16 v2, 0x41

    aput-object v1, v0, v2

    const-string v1, "diu"

    const/16 v2, 0x42

    aput-object v1, v0, v2

    const-string v1, "dong"

    const/16 v2, 0x43

    aput-object v1, v0, v2

    const-string v1, "dou"

    const/16 v2, 0x44

    aput-object v1, v0, v2

    const-string v1, "du"

    const/16 v2, 0x45

    aput-object v1, v0, v2

    const-string v1, "duan"

    const/16 v2, 0x46

    aput-object v1, v0, v2

    const-string v1, "dui"

    const/16 v2, 0x47

    aput-object v1, v0, v2

    const-string v1, "dun"

    const/16 v2, 0x48

    aput-object v1, v0, v2

    const-string v1, "duo"

    const/16 v2, 0x49

    aput-object v1, v0, v2

    const-string v1, "e"

    const/16 v2, 0x4a

    aput-object v1, v0, v2

    const-string v1, "en"

    const/16 v2, 0x4b

    aput-object v1, v0, v2

    const-string v1, "er"

    const/16 v2, 0x4c

    aput-object v1, v0, v2

    const-string v1, "fa"

    const/16 v2, 0x4d

    aput-object v1, v0, v2

    const-string v1, "fan"

    const/16 v2, 0x4e

    aput-object v1, v0, v2

    const-string v1, "fang"

    const/16 v2, 0x4f

    aput-object v1, v0, v2

    const-string v1, "fei"

    const/16 v2, 0x50

    aput-object v1, v0, v2

    const-string v1, "fen"

    const/16 v2, 0x51

    aput-object v1, v0, v2

    const-string v1, "feng"

    const/16 v2, 0x52

    aput-object v1, v0, v2

    const-string v1, "fo"

    const/16 v2, 0x53

    aput-object v1, v0, v2

    const-string v1, "fou"

    const/16 v2, 0x54

    aput-object v1, v0, v2

    const-string v1, "fu"

    const/16 v2, 0x55

    aput-object v1, v0, v2

    const-string v1, "ga"

    const/16 v2, 0x56

    aput-object v1, v0, v2

    const-string v1, "gai"

    const/16 v2, 0x57

    aput-object v1, v0, v2

    const-string v1, "gan"

    const/16 v2, 0x58

    aput-object v1, v0, v2

    const-string v1, "gang"

    const/16 v2, 0x59

    aput-object v1, v0, v2

    const-string v1, "gao"

    const/16 v2, 0x5a

    aput-object v1, v0, v2

    const-string v1, "ge"

    const/16 v2, 0x5b

    aput-object v1, v0, v2

    const-string v1, "gei"

    const/16 v2, 0x5c

    aput-object v1, v0, v2

    const-string v1, "gen"

    const/16 v2, 0x5d

    aput-object v1, v0, v2

    const-string v1, "geng"

    const/16 v2, 0x5e

    aput-object v1, v0, v2

    const-string v1, "gong"

    const/16 v2, 0x5f

    aput-object v1, v0, v2

    const-string v1, "gou"

    const/16 v2, 0x60

    aput-object v1, v0, v2

    const-string v1, "gu"

    const/16 v2, 0x61

    aput-object v1, v0, v2

    const-string v1, "gua"

    const/16 v2, 0x62

    aput-object v1, v0, v2

    const-string v1, "guai"

    const/16 v2, 0x63

    aput-object v1, v0, v2

    const-string v1, "guan"

    const/16 v2, 0x64

    aput-object v1, v0, v2

    const-string v1, "guang"

    const/16 v2, 0x65

    aput-object v1, v0, v2

    const-string v1, "gui"

    const/16 v2, 0x66

    aput-object v1, v0, v2

    const-string v1, "gun"

    const/16 v2, 0x67

    aput-object v1, v0, v2

    const-string v1, "guo"

    const/16 v2, 0x68

    aput-object v1, v0, v2

    const-string v1, "ha"

    const/16 v2, 0x69

    aput-object v1, v0, v2

    const-string v1, "hai"

    const/16 v2, 0x6a

    aput-object v1, v0, v2

    const-string v1, "han"

    const/16 v2, 0x6b

    aput-object v1, v0, v2

    const-string v1, "hang"

    const/16 v2, 0x6c

    aput-object v1, v0, v2

    const-string v1, "hao"

    const/16 v2, 0x6d

    aput-object v1, v0, v2

    const-string v1, "he"

    const/16 v2, 0x6e

    aput-object v1, v0, v2

    const-string v1, "hei"

    const/16 v2, 0x6f

    aput-object v1, v0, v2

    const-string v1, "hen"

    const/16 v2, 0x70

    aput-object v1, v0, v2

    const-string v1, "heng"

    const/16 v2, 0x71

    aput-object v1, v0, v2

    const-string v1, "hong"

    const/16 v2, 0x72

    aput-object v1, v0, v2

    const-string v1, "hou"

    const/16 v2, 0x73

    aput-object v1, v0, v2

    const-string v1, "hu"

    const/16 v2, 0x74

    aput-object v1, v0, v2

    const-string v1, "hua"

    const/16 v2, 0x75

    aput-object v1, v0, v2

    const-string v1, "huai"

    const/16 v2, 0x76

    aput-object v1, v0, v2

    const-string v1, "huan"

    const/16 v2, 0x77

    aput-object v1, v0, v2

    const-string v1, "huang"

    const/16 v2, 0x78

    aput-object v1, v0, v2

    const-string v1, "hui"

    const/16 v2, 0x79

    aput-object v1, v0, v2

    const-string v1, "hun"

    const/16 v2, 0x7a

    aput-object v1, v0, v2

    const-string v1, "huo"

    const/16 v2, 0x7b

    aput-object v1, v0, v2

    const-string v1, "ji"

    const/16 v2, 0x7c

    aput-object v1, v0, v2

    const-string v1, "jia"

    const/16 v2, 0x7d

    aput-object v1, v0, v2

    const-string v1, "jian"

    const/16 v2, 0x7e

    aput-object v1, v0, v2

    const-string v1, "jiang"

    const/16 v2, 0x7f

    aput-object v1, v0, v2

    const-string v1, "jiao"

    const/16 v2, 0x80

    aput-object v1, v0, v2

    const-string v1, "jie"

    const/16 v2, 0x81

    aput-object v1, v0, v2

    const-string v1, "jin"

    const/16 v2, 0x82

    aput-object v1, v0, v2

    const-string v1, "jing"

    const/16 v2, 0x83

    aput-object v1, v0, v2

    const-string v1, "jiong"

    const/16 v2, 0x84

    aput-object v1, v0, v2

    const-string v1, "jiu"

    const/16 v2, 0x85

    aput-object v1, v0, v2

    const-string v1, "ju"

    const/16 v2, 0x86

    aput-object v1, v0, v2

    const-string v1, "juan"

    const/16 v2, 0x87

    aput-object v1, v0, v2

    const-string v1, "jue"

    const/16 v2, 0x88

    aput-object v1, v0, v2

    const-string v1, "jun"

    const/16 v2, 0x89

    aput-object v1, v0, v2

    const-string v1, "ka"

    const/16 v2, 0x8a

    aput-object v1, v0, v2

    const-string v1, "kai"

    const/16 v2, 0x8b

    aput-object v1, v0, v2

    const-string v1, "kan"

    const/16 v2, 0x8c

    aput-object v1, v0, v2

    const-string v1, "kang"

    const/16 v2, 0x8d

    aput-object v1, v0, v2

    const-string v1, "kao"

    const/16 v2, 0x8e

    aput-object v1, v0, v2

    const-string v1, "ke"

    const/16 v2, 0x8f

    aput-object v1, v0, v2

    const-string v1, "ken"

    const/16 v2, 0x90

    aput-object v1, v0, v2

    const-string v1, "keng"

    const/16 v2, 0x91

    aput-object v1, v0, v2

    const-string v1, "kong"

    const/16 v2, 0x92

    aput-object v1, v0, v2

    const-string v1, "kou"

    const/16 v2, 0x93

    aput-object v1, v0, v2

    const-string v1, "ku"

    const/16 v2, 0x94

    aput-object v1, v0, v2

    const-string v1, "kua"

    const/16 v2, 0x95

    aput-object v1, v0, v2

    const-string v1, "kuai"

    const/16 v2, 0x96

    aput-object v1, v0, v2

    const-string v1, "kuan"

    const/16 v2, 0x97

    aput-object v1, v0, v2

    const-string v1, "kuang"

    const/16 v2, 0x98

    aput-object v1, v0, v2

    const-string v1, "kui"

    const/16 v2, 0x99

    aput-object v1, v0, v2

    const-string v1, "kun"

    const/16 v2, 0x9a

    aput-object v1, v0, v2

    const-string v1, "kuo"

    const/16 v2, 0x9b

    aput-object v1, v0, v2

    const-string v1, "la"

    const/16 v2, 0x9c

    aput-object v1, v0, v2

    const-string v1, "lai"

    const/16 v2, 0x9d

    aput-object v1, v0, v2

    const-string v1, "lan"

    const/16 v2, 0x9e

    aput-object v1, v0, v2

    const-string v1, "lang"

    const/16 v2, 0x9f

    aput-object v1, v0, v2

    const-string v1, "lao"

    const/16 v2, 0xa0

    aput-object v1, v0, v2

    const-string v1, "le"

    const/16 v2, 0xa1

    aput-object v1, v0, v2

    const-string v1, "lei"

    const/16 v2, 0xa2

    aput-object v1, v0, v2

    const-string v1, "leng"

    const/16 v2, 0xa3

    aput-object v1, v0, v2

    const-string v1, "li"

    const/16 v2, 0xa4

    aput-object v1, v0, v2

    const-string v1, "lia"

    const/16 v2, 0xa5

    aput-object v1, v0, v2

    const-string v1, "lian"

    const/16 v2, 0xa6

    aput-object v1, v0, v2

    const-string v1, "liang"

    const/16 v2, 0xa7

    aput-object v1, v0, v2

    const-string v1, "liao"

    const/16 v2, 0xa8

    aput-object v1, v0, v2

    const-string v1, "lie"

    const/16 v2, 0xa9

    aput-object v1, v0, v2

    const-string v1, "lin"

    const/16 v2, 0xaa

    aput-object v1, v0, v2

    const-string v1, "ling"

    const/16 v2, 0xab

    aput-object v1, v0, v2

    const-string v1, "liu"

    const/16 v2, 0xac

    aput-object v1, v0, v2

    const-string v1, "long"

    const/16 v2, 0xad

    aput-object v1, v0, v2

    const-string v1, "lou"

    const/16 v2, 0xae

    aput-object v1, v0, v2

    const-string v1, "lu"

    const/16 v2, 0xaf

    aput-object v1, v0, v2

    const-string v1, "lv"

    const/16 v2, 0xb0

    aput-object v1, v0, v2

    const-string v1, "luan"

    const/16 v2, 0xb1

    aput-object v1, v0, v2

    const-string v1, "lue"

    const/16 v2, 0xb2

    aput-object v1, v0, v2

    const-string v1, "lun"

    const/16 v2, 0xb3

    aput-object v1, v0, v2

    const-string v1, "luo"

    const/16 v2, 0xb4

    aput-object v1, v0, v2

    const-string v1, "ma"

    const/16 v2, 0xb5

    aput-object v1, v0, v2

    const-string v1, "mai"

    const/16 v2, 0xb6

    aput-object v1, v0, v2

    const-string v1, "man"

    const/16 v2, 0xb7

    aput-object v1, v0, v2

    const-string v1, "mang"

    const/16 v2, 0xb8

    aput-object v1, v0, v2

    const-string v1, "mao"

    const/16 v2, 0xb9

    aput-object v1, v0, v2

    const-string v1, "me"

    const/16 v2, 0xba

    aput-object v1, v0, v2

    const-string v1, "mei"

    const/16 v2, 0xbb

    aput-object v1, v0, v2

    const-string v1, "men"

    const/16 v2, 0xbc

    aput-object v1, v0, v2

    const-string v1, "meng"

    const/16 v2, 0xbd

    aput-object v1, v0, v2

    const-string v1, "mi"

    const/16 v2, 0xbe

    aput-object v1, v0, v2

    const-string v1, "mian"

    const/16 v2, 0xbf

    aput-object v1, v0, v2

    const-string v1, "miao"

    const/16 v2, 0xc0

    aput-object v1, v0, v2

    const-string v1, "mie"

    const/16 v2, 0xc1

    aput-object v1, v0, v2

    const-string v1, "min"

    const/16 v2, 0xc2

    aput-object v1, v0, v2

    const-string v1, "ming"

    const/16 v2, 0xc3

    aput-object v1, v0, v2

    const-string v1, "miu"

    const/16 v2, 0xc4

    aput-object v1, v0, v2

    const-string v1, "mo"

    const/16 v2, 0xc5

    aput-object v1, v0, v2

    const-string v1, "mou"

    const/16 v2, 0xc6

    aput-object v1, v0, v2

    const-string v1, "mu"

    const/16 v2, 0xc7

    aput-object v1, v0, v2

    const-string v1, "na"

    const/16 v2, 0xc8

    aput-object v1, v0, v2

    const-string v1, "nai"

    const/16 v2, 0xc9

    aput-object v1, v0, v2

    const-string v1, "nan"

    const/16 v2, 0xca

    aput-object v1, v0, v2

    const-string v1, "nang"

    const/16 v2, 0xcb

    aput-object v1, v0, v2

    const-string v1, "nao"

    const/16 v2, 0xcc

    aput-object v1, v0, v2

    const-string v1, "ne"

    const/16 v2, 0xcd

    aput-object v1, v0, v2

    const-string v1, "nei"

    const/16 v2, 0xce

    aput-object v1, v0, v2

    const-string v1, "nen"

    const/16 v2, 0xcf

    aput-object v1, v0, v2

    const-string v1, "neng"

    const/16 v2, 0xd0

    aput-object v1, v0, v2

    const-string v1, "ni"

    const/16 v2, 0xd1

    aput-object v1, v0, v2

    const-string v1, "nian"

    const/16 v2, 0xd2

    aput-object v1, v0, v2

    const-string v1, "niang"

    const/16 v2, 0xd3

    aput-object v1, v0, v2

    const-string v1, "niao"

    const/16 v2, 0xd4

    aput-object v1, v0, v2

    const-string v1, "nie"

    const/16 v2, 0xd5

    aput-object v1, v0, v2

    const-string v1, "nin"

    const/16 v2, 0xd6

    aput-object v1, v0, v2

    const-string v1, "ning"

    const/16 v2, 0xd7

    aput-object v1, v0, v2

    const-string v1, "niu"

    const/16 v2, 0xd8

    aput-object v1, v0, v2

    const-string v1, "nong"

    const/16 v2, 0xd9

    aput-object v1, v0, v2

    const-string v1, "nu"

    const/16 v2, 0xda

    aput-object v1, v0, v2

    const-string v1, "nv"

    const/16 v2, 0xdb

    aput-object v1, v0, v2

    const-string v1, "nuan"

    const/16 v2, 0xdc

    aput-object v1, v0, v2

    const-string v1, "nue"

    const/16 v2, 0xdd

    aput-object v1, v0, v2

    const-string v1, "nuo"

    const/16 v2, 0xde

    aput-object v1, v0, v2

    const-string v1, "o"

    const/16 v2, 0xdf

    aput-object v1, v0, v2

    const-string v1, "ou"

    const/16 v2, 0xe0

    aput-object v1, v0, v2

    const-string v1, "pa"

    const/16 v2, 0xe1

    aput-object v1, v0, v2

    const-string v1, "pai"

    const/16 v2, 0xe2

    aput-object v1, v0, v2

    const-string v1, "pan"

    const/16 v2, 0xe3

    aput-object v1, v0, v2

    const-string v1, "pang"

    const/16 v2, 0xe4

    aput-object v1, v0, v2

    const-string v1, "pao"

    const/16 v2, 0xe5

    aput-object v1, v0, v2

    const-string v1, "pei"

    const/16 v2, 0xe6

    aput-object v1, v0, v2

    const-string v1, "pen"

    const/16 v2, 0xe7

    aput-object v1, v0, v2

    const-string v1, "peng"

    const/16 v2, 0xe8

    aput-object v1, v0, v2

    const-string v1, "pi"

    const/16 v2, 0xe9

    aput-object v1, v0, v2

    const-string v1, "pian"

    const/16 v2, 0xea

    aput-object v1, v0, v2

    const-string v1, "piao"

    const/16 v2, 0xeb

    aput-object v1, v0, v2

    const-string v1, "pie"

    const/16 v2, 0xec

    aput-object v1, v0, v2

    const-string v1, "pin"

    const/16 v2, 0xed

    aput-object v1, v0, v2

    const-string v1, "ping"

    const/16 v2, 0xee

    aput-object v1, v0, v2

    const-string v1, "po"

    const/16 v2, 0xef

    aput-object v1, v0, v2

    const-string v1, "pu"

    const/16 v2, 0xf0

    aput-object v1, v0, v2

    const-string v1, "qi"

    const/16 v2, 0xf1

    aput-object v1, v0, v2

    const-string v1, "qia"

    const/16 v2, 0xf2

    aput-object v1, v0, v2

    const-string v1, "qian"

    const/16 v2, 0xf3

    aput-object v1, v0, v2

    const-string v1, "qiang"

    const/16 v2, 0xf4

    aput-object v1, v0, v2

    const-string v1, "qiao"

    const/16 v2, 0xf5

    aput-object v1, v0, v2

    const-string v1, "qie"

    const/16 v2, 0xf6

    aput-object v1, v0, v2

    const-string v1, "qin"

    const/16 v2, 0xf7

    aput-object v1, v0, v2

    const-string v1, "qing"

    const/16 v2, 0xf8

    aput-object v1, v0, v2

    const-string v1, "qiong"

    const/16 v2, 0xf9

    aput-object v1, v0, v2

    const-string v1, "qiu"

    const/16 v2, 0xfa

    aput-object v1, v0, v2

    const-string v1, "qu"

    const/16 v2, 0xfb

    aput-object v1, v0, v2

    const-string v1, "quan"

    const/16 v2, 0xfc

    aput-object v1, v0, v2

    const-string v1, "que"

    const/16 v2, 0xfd

    aput-object v1, v0, v2

    const-string v1, "qun"

    const/16 v2, 0xfe

    aput-object v1, v0, v2

    const-string v1, "ran"

    const/16 v2, 0xff

    aput-object v1, v0, v2

    const-string v1, "rang"

    const/16 v2, 0x100

    aput-object v1, v0, v2

    const-string v1, "rao"

    const/16 v2, 0x101

    aput-object v1, v0, v2

    const-string v1, "re"

    const/16 v2, 0x102

    aput-object v1, v0, v2

    const-string v1, "ren"

    const/16 v2, 0x103

    aput-object v1, v0, v2

    const-string v1, "reng"

    const/16 v2, 0x104

    aput-object v1, v0, v2

    const-string v1, "ri"

    const/16 v2, 0x105

    aput-object v1, v0, v2

    const-string v1, "rong"

    const/16 v2, 0x106

    aput-object v1, v0, v2

    const-string v1, "rou"

    const/16 v2, 0x107

    aput-object v1, v0, v2

    const-string v1, "ru"

    const/16 v2, 0x108

    aput-object v1, v0, v2

    const-string v1, "ruan"

    const/16 v2, 0x109

    aput-object v1, v0, v2

    const-string v1, "rui"

    const/16 v2, 0x10a

    aput-object v1, v0, v2

    const-string v1, "run"

    const/16 v2, 0x10b

    aput-object v1, v0, v2

    const-string v1, "ruo"

    const/16 v2, 0x10c

    aput-object v1, v0, v2

    const-string v1, "sa"

    const/16 v2, 0x10d

    aput-object v1, v0, v2

    const-string v1, "sai"

    const/16 v2, 0x10e

    aput-object v1, v0, v2

    const-string v1, "san"

    const/16 v2, 0x10f

    aput-object v1, v0, v2

    const-string v1, "sang"

    const/16 v2, 0x110

    aput-object v1, v0, v2

    const-string v1, "sao"

    const/16 v2, 0x111

    aput-object v1, v0, v2

    const-string v1, "se"

    const/16 v2, 0x112

    aput-object v1, v0, v2

    const-string v1, "sen"

    const/16 v2, 0x113

    aput-object v1, v0, v2

    const-string v1, "seng"

    const/16 v2, 0x114

    aput-object v1, v0, v2

    const-string v1, "sha"

    const/16 v2, 0x115

    aput-object v1, v0, v2

    const-string v1, "shai"

    const/16 v2, 0x116

    aput-object v1, v0, v2

    const-string v1, "shan"

    const/16 v2, 0x117

    aput-object v1, v0, v2

    const-string v1, "shang"

    const/16 v2, 0x118

    aput-object v1, v0, v2

    const-string v1, "shao"

    const/16 v2, 0x119

    aput-object v1, v0, v2

    const-string v1, "she"

    const/16 v2, 0x11a

    aput-object v1, v0, v2

    const-string v1, "shen"

    const/16 v2, 0x11b

    aput-object v1, v0, v2

    const-string v1, "sheng"

    const/16 v2, 0x11c

    aput-object v1, v0, v2

    const-string v1, "shi"

    const/16 v2, 0x11d

    aput-object v1, v0, v2

    const-string v1, "shou"

    const/16 v2, 0x11e

    aput-object v1, v0, v2

    const-string v1, "shu"

    const/16 v2, 0x11f

    aput-object v1, v0, v2

    const-string v1, "shua"

    const/16 v2, 0x120

    aput-object v1, v0, v2

    const-string v1, "shuai"

    const/16 v2, 0x121

    aput-object v1, v0, v2

    const-string v1, "shuan"

    const/16 v2, 0x122

    aput-object v1, v0, v2

    const-string v1, "shuang"

    const/16 v2, 0x123

    aput-object v1, v0, v2

    const-string v1, "shui"

    const/16 v2, 0x124

    aput-object v1, v0, v2

    const-string v1, "shun"

    const/16 v2, 0x125

    aput-object v1, v0, v2

    const-string v1, "shuo"

    const/16 v2, 0x126

    aput-object v1, v0, v2

    const-string v1, "si"

    const/16 v2, 0x127

    aput-object v1, v0, v2

    const-string v1, "song"

    const/16 v2, 0x128

    aput-object v1, v0, v2

    const-string v1, "sou"

    const/16 v2, 0x129

    aput-object v1, v0, v2

    const-string v1, "su"

    const/16 v2, 0x12a

    aput-object v1, v0, v2

    const-string v1, "suan"

    const/16 v2, 0x12b

    aput-object v1, v0, v2

    const-string v1, "sui"

    const/16 v2, 0x12c

    aput-object v1, v0, v2

    const-string v1, "sun"

    const/16 v2, 0x12d

    aput-object v1, v0, v2

    const-string v1, "suo"

    const/16 v2, 0x12e

    aput-object v1, v0, v2

    const-string v1, "ta"

    const/16 v2, 0x12f

    aput-object v1, v0, v2

    const-string v1, "tai"

    const/16 v2, 0x130

    aput-object v1, v0, v2

    const-string v1, "tan"

    const/16 v2, 0x131

    aput-object v1, v0, v2

    const-string v1, "tang"

    const/16 v2, 0x132

    aput-object v1, v0, v2

    const-string v1, "tao"

    const/16 v2, 0x133

    aput-object v1, v0, v2

    const-string v1, "te"

    const/16 v2, 0x134

    aput-object v1, v0, v2

    const-string v1, "teng"

    const/16 v2, 0x135

    aput-object v1, v0, v2

    const-string v1, "ti"

    const/16 v2, 0x136

    aput-object v1, v0, v2

    const-string v1, "tian"

    const/16 v2, 0x137

    aput-object v1, v0, v2

    const-string v1, "tiao"

    const/16 v2, 0x138

    aput-object v1, v0, v2

    const-string v1, "tie"

    const/16 v2, 0x139

    aput-object v1, v0, v2

    const-string v1, "ting"

    const/16 v2, 0x13a

    aput-object v1, v0, v2

    const-string v1, "tong"

    const/16 v2, 0x13b

    aput-object v1, v0, v2

    const-string v1, "tou"

    const/16 v2, 0x13c

    aput-object v1, v0, v2

    const-string v1, "tu"

    const/16 v2, 0x13d

    aput-object v1, v0, v2

    const-string v1, "tuan"

    const/16 v2, 0x13e

    aput-object v1, v0, v2

    const-string v1, "tui"

    const/16 v2, 0x13f

    aput-object v1, v0, v2

    const-string v1, "tun"

    const/16 v2, 0x140

    aput-object v1, v0, v2

    const-string v1, "tuo"

    const/16 v2, 0x141

    aput-object v1, v0, v2

    const-string v1, "wa"

    const/16 v2, 0x142

    aput-object v1, v0, v2

    const-string v1, "wai"

    const/16 v2, 0x143

    aput-object v1, v0, v2

    const-string v1, "wan"

    const/16 v2, 0x144

    aput-object v1, v0, v2

    const-string v1, "wang"

    const/16 v2, 0x145

    aput-object v1, v0, v2

    const-string v1, "wei"

    const/16 v2, 0x146

    aput-object v1, v0, v2

    const-string v1, "wen"

    const/16 v2, 0x147

    aput-object v1, v0, v2

    const-string v1, "weng"

    const/16 v2, 0x148

    aput-object v1, v0, v2

    const-string v1, "wo"

    const/16 v2, 0x149

    aput-object v1, v0, v2

    const-string v1, "wu"

    const/16 v2, 0x14a

    aput-object v1, v0, v2

    const-string v1, "xi"

    const/16 v2, 0x14b

    aput-object v1, v0, v2

    const-string v1, "xia"

    const/16 v2, 0x14c

    aput-object v1, v0, v2

    const-string v1, "xian"

    const/16 v2, 0x14d

    aput-object v1, v0, v2

    const-string v1, "xiang"

    const/16 v2, 0x14e

    aput-object v1, v0, v2

    const-string v1, "xiao"

    const/16 v2, 0x14f

    aput-object v1, v0, v2

    const-string v1, "xie"

    const/16 v2, 0x150

    aput-object v1, v0, v2

    const-string v1, "xin"

    const/16 v2, 0x151

    aput-object v1, v0, v2

    const-string v1, "xing"

    const/16 v2, 0x152

    aput-object v1, v0, v2

    const-string v1, "xiong"

    const/16 v2, 0x153

    aput-object v1, v0, v2

    const-string v1, "xiu"

    const/16 v2, 0x154

    aput-object v1, v0, v2

    const-string v1, "xu"

    const/16 v2, 0x155

    aput-object v1, v0, v2

    const-string v1, "xuan"

    const/16 v2, 0x156

    aput-object v1, v0, v2

    const-string v1, "xue"

    const/16 v2, 0x157

    aput-object v1, v0, v2

    const-string v1, "xun"

    const/16 v2, 0x158

    aput-object v1, v0, v2

    const-string v1, "ya"

    const/16 v2, 0x159

    aput-object v1, v0, v2

    const-string v1, "yan"

    const/16 v2, 0x15a

    aput-object v1, v0, v2

    const-string v1, "yang"

    const/16 v2, 0x15b

    aput-object v1, v0, v2

    const-string v1, "yao"

    const/16 v2, 0x15c

    aput-object v1, v0, v2

    const-string v1, "ye"

    const/16 v2, 0x15d

    aput-object v1, v0, v2

    const-string v1, "yi"

    const/16 v2, 0x15e

    aput-object v1, v0, v2

    const-string v1, "yin"

    const/16 v2, 0x15f

    aput-object v1, v0, v2

    const-string v1, "ying"

    const/16 v2, 0x160

    aput-object v1, v0, v2

    const-string v1, "yo"

    const/16 v2, 0x161

    aput-object v1, v0, v2

    const-string v1, "yong"

    const/16 v2, 0x162

    aput-object v1, v0, v2

    const-string v1, "you"

    const/16 v2, 0x163

    aput-object v1, v0, v2

    const-string v1, "yu"

    const/16 v2, 0x164

    aput-object v1, v0, v2

    const-string v1, "yuan"

    const/16 v2, 0x165

    aput-object v1, v0, v2

    const-string v1, "yue"

    const/16 v2, 0x166

    aput-object v1, v0, v2

    const-string v1, "yun"

    const/16 v2, 0x167

    aput-object v1, v0, v2

    const-string v1, "za"

    const/16 v2, 0x168

    aput-object v1, v0, v2

    const-string v1, "zai"

    const/16 v2, 0x169

    aput-object v1, v0, v2

    const-string v1, "zan"

    const/16 v2, 0x16a

    aput-object v1, v0, v2

    const-string v1, "zang"

    const/16 v2, 0x16b

    aput-object v1, v0, v2

    const-string v1, "zao"

    const/16 v2, 0x16c

    aput-object v1, v0, v2

    const-string v1, "ze"

    const/16 v2, 0x16d

    aput-object v1, v0, v2

    const-string v1, "zei"

    const/16 v2, 0x16e

    aput-object v1, v0, v2

    const-string v1, "zen"

    const/16 v2, 0x16f

    aput-object v1, v0, v2

    const-string v1, "zeng"

    const/16 v2, 0x170

    aput-object v1, v0, v2

    const-string v1, "zha"

    const/16 v2, 0x171

    aput-object v1, v0, v2

    const-string v1, "zhai"

    const/16 v2, 0x172

    aput-object v1, v0, v2

    const-string v1, "zhan"

    const/16 v2, 0x173

    aput-object v1, v0, v2

    const-string v1, "zhang"

    const/16 v2, 0x174

    aput-object v1, v0, v2

    const-string v1, "zhao"

    const/16 v2, 0x175

    aput-object v1, v0, v2

    const-string v1, "zhe"

    const/16 v2, 0x176

    aput-object v1, v0, v2

    const-string v1, "zhen"

    const/16 v2, 0x177

    aput-object v1, v0, v2

    const-string v1, "zheng"

    const/16 v2, 0x178

    aput-object v1, v0, v2

    const-string v1, "zhi"

    const/16 v2, 0x179

    aput-object v1, v0, v2

    const-string v1, "zhong"

    const/16 v2, 0x17a

    aput-object v1, v0, v2

    const-string v1, "zhou"

    const/16 v2, 0x17b

    aput-object v1, v0, v2

    const-string v1, "zhu"

    const/16 v2, 0x17c

    aput-object v1, v0, v2

    const-string v1, "zhua"

    const/16 v2, 0x17d

    aput-object v1, v0, v2

    const-string v1, "zhuai"

    const/16 v2, 0x17e

    aput-object v1, v0, v2

    const-string v1, "zhuan"

    const/16 v2, 0x17f

    aput-object v1, v0, v2

    const-string v1, "zhuang"

    const/16 v2, 0x180

    aput-object v1, v0, v2

    const-string v1, "zhui"

    const/16 v2, 0x181

    aput-object v1, v0, v2

    const-string v1, "zhun"

    const/16 v2, 0x182

    aput-object v1, v0, v2

    const-string v1, "zhuo"

    const/16 v2, 0x183

    aput-object v1, v0, v2

    const-string v1, "zi"

    const/16 v2, 0x184

    aput-object v1, v0, v2

    const-string v1, "zong"

    const/16 v2, 0x185

    aput-object v1, v0, v2

    const-string v1, "zou"

    const/16 v2, 0x186

    aput-object v1, v0, v2

    const-string v1, "zu"

    const/16 v2, 0x187

    aput-object v1, v0, v2

    const-string v1, "zuan"

    const/16 v2, 0x188

    aput-object v1, v0, v2

    const-string v1, "zui"

    const/16 v2, 0x189

    aput-object v1, v0, v2

    const-string v1, "zun"

    const/16 v2, 0x18a

    aput-object v1, v0, v2

    const-string v1, "zuo"

    const/16 v2, 0x18b

    aput-object v1, v0, v2

    sput-object v0, Lcom/lljjcoder/style/citylist/sortlistview/CharacterParser;->pystr:[Ljava/lang/String;

    .line 3
    new-instance v0, Lcom/lljjcoder/style/citylist/sortlistview/CharacterParser;

    invoke-direct {v0}, Lcom/lljjcoder/style/citylist/sortlistview/CharacterParser;-><init>()V

    sput-object v0, Lcom/lljjcoder/style/citylist/sortlistview/CharacterParser;->characterParser:Lcom/lljjcoder/style/citylist/sortlistview/CharacterParser;

    return-void

    nop

    :array_0
    .array-data 4
        -0x4f5f
        -0x4f5d
        -0x4f50
        -0x4f47
        -0x4f44
        -0x4f3b
        -0x4f29
        -0x4f21
        -0x4f12
        -0x4f06
        -0x4e53
        -0x4e44
        -0x4e40
        -0x4e3a
        -0x4e22
        -0x4e16
        -0x4e12
        -0x4e0e
        -0x4e08
        -0x4d5d
        -0x4d48
        -0x4d3f
        -0x4d3e
        -0x4d33
        -0x4d2c
        -0x4d27
        -0x4d22
        -0x4d1d
        -0x4d1b
        -0x4d10
        -0x4d0d
        -0x4d03
        -0x4c54
        -0x4c4b
        -0x4c45
        -0x4c3b
        -0x4c2c
        -0x4c1c
        -0x4c17
        -0x4c0b
        -0x4b59
        -0x4b58
        -0x4b51
        -0x4b4b
        -0x4b46
        -0x4b3f
        -0x4b3d
        -0x4b31
        -0x4b2b
        -0x4b2a
        -0x4b26
        -0x4b23
        -0x4b1b
        -0x4b18
        -0x4b12
        -0x4b0c
        -0x4a5e
        -0x4a4f
        -0x4a4a
        -0x4a3e
        -0x4a3b
        -0x4a34
        -0x4a21
        -0x4a11
        -0x4a08
        -0x495f
        -0x4956
        -0x4955
        -0x494b
        -0x4944
        -0x4935
        -0x492f
        -0x492b
        -0x4922
        -0x4916
        -0x4909
        -0x4908
        -0x485e
        -0x4856
        -0x4845
        -0x483a
        -0x482e
        -0x481f
        -0x4810
        -0x480f
        -0x480e
        -0x473f
        -0x473d
        -0x4737
        -0x472c
        -0x4723
        -0x4719
        -0x4708
        -0x4707
        -0x4705
        -0x465c
        -0x464d
        -0x4644
        -0x4632
        -0x462c
        -0x4629
        -0x461e
        -0x461b
        -0x460b
        -0x4608
        -0x4602
        -0x455f
        -0x4558
        -0x4545
        -0x4542
        -0x4539
        -0x4527
        -0x4525
        -0x4521
        -0x451c
        -0x4513
        -0x450c
        -0x4458
        -0x444f
        -0x444a
        -0x443c
        -0x442e
        -0x4419
        -0x4413
        -0x4409
        -0x4332
        -0x4321
        -0x4257
        -0x424a
        -0x422e
        -0x4213
        -0x415d
        -0x4144
        -0x4142
        -0x4131
        -0x4118
        -0x4111
        -0x4107
        -0x405a
        -0x4056
        -0x4051
        -0x404b
        -0x4044
        -0x4040
        -0x4031
        -0x402d
        -0x402b
        -0x4027
        -0x4023
        -0x401c
        -0x4017
        -0x4013
        -0x4011
        -0x4009
        -0x3f5c
        -0x3f58
        -0x3f54
        -0x3f4d
        -0x3f4a
        -0x3f3b
        -0x3f34
        -0x3f2b
        -0x3f29
        -0x3f1e
        -0x3f1b
        -0x3e57
        -0x3e56
        -0x3e48
        -0x3e3d
        -0x3e30
        -0x3e2b
        -0x3e1f
        -0x3e11
        -0x3e06
        -0x3d5b
        -0x3d55
        -0x3d41
        -0x3d33
        -0x3d2d
        -0x3d2b
        -0x3d24
        -0x3d18
        -0x3d0f
        -0x3d09
        -0x3c5e
        -0x3c58
        -0x3c4c
        -0x3c4b
        -0x3c3b
        -0x3c38
        -0x3c30
        -0x3c22
        -0x3c19
        -0x3c11
        -0x3c0f
        -0x3c09
        -0x3c03
        -0x3c02
        -0x3b4f
        -0x3b4c
        -0x3b3d
        -0x3b36
        -0x3b31
        -0x3b2e
        -0x3b2d
        -0x3b28
        -0x3b27
        -0x3b25
        -0x3b24
        -0x3b23
        -0x3b18
        -0x3b11
        -0x3b0f
        -0x3b0d
        -0x3b06
        -0x3b05
        -0x3a5d
        -0x3a59
        -0x3a55
        -0x3a52
        -0x3a51
        -0x3a50
        -0x3a4e
        -0x3a4a
        -0x3a49
        -0x3a42
        -0x3a3c
        -0x3a36
        -0x3a2e
        -0x3a29
        -0x3a22
        -0x3a19
        -0x3a17
        -0x3a09
        -0x3956
        -0x3952
        -0x394e
        -0x394c
        -0x3947
        -0x393e
        -0x3935
        -0x3926
        -0x3902
        -0x385d
        -0x3847
        -0x383f
        -0x3830
        -0x382b
        -0x3820
        -0x3813
        -0x3811
        -0x3809
        -0x375a
        -0x374f
        -0x3747
        -0x3745
        -0x3741
        -0x373c
        -0x3739
        -0x3737
        -0x372d
        -0x372b
        -0x372a
        -0x3720
        -0x371d
        -0x3713
        -0x3711
        -0x370e
        -0x370c
        -0x370a
        -0x3707
        -0x3703
        -0x365d
        -0x365a
        -0x3656
        -0x3653
        -0x3652
        -0x3651
        -0x3648
        -0x3646
        -0x3636
        -0x362e
        -0x3623
        -0x3617
        -0x3607
        -0x355a
        -0x352b
        -0x3521
        -0x345e
        -0x345c
        -0x3458
        -0x3456
        -0x3453
        -0x344f
        -0x344b
        -0x3447
        -0x3437
        -0x342f
        -0x342c
        -0x341f
        -0x341c
        -0x3411
        -0x340e
        -0x3406
        -0x335b
        -0x3352
        -0x3340
        -0x3333
        -0x3328
        -0x3327
        -0x3323
        -0x3314
        -0x330c
        -0x3307
        -0x3304
        -0x3258
        -0x324b
        -0x3247
        -0x323c
        -0x323a
        -0x3234
        -0x3231
        -0x3226
        -0x321f
        -0x321d
        -0x320c
        -0x3202
        -0x313f
        -0x3135
        -0x3132
        -0x3129
        -0x310c
        -0x3047
        -0x303a
        -0x3020
        -0x300c
        -0x2f58
        -0x2f43
        -0x2f39
        -0x2f2a
        -0x2f23
        -0x2f1a
        -0x2f07
        -0x2e5b
        -0x2e55
        -0x2e47
        -0x2e37
        -0x2e16
        -0x2e05
        -0x2d54
        -0x2d45
        -0x2d10
        -0x2c5e
        -0x2c4c
        -0x2c4b
        -0x2c3c
        -0x2c27
        -0x2b59
        -0x2b45
        -0x2b3b
        -0x2b2f
        -0x2b2c
        -0x2b25
        -0x2b21
        -0x2b1e
        -0x2b10
        -0x2b0c
        -0x2b0b
        -0x2b0a
        -0x2b06
        -0x2a56
        -0x2a50
        -0x2a3f
        -0x2a30
        -0x2a26
        -0x2a1c
        -0x2a0c
        -0x295b
        -0x2930
        -0x2925
        -0x2917
        -0x285b
        -0x2859
        -0x2858
        -0x2852
        -0x284b
        -0x2845
        -0x2843
        -0x2838
        -0x2829
        -0x2822
        -0x281e
        -0x2816
        -0x2814
        -0x2810
        -0x280e
    .end array-data
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private getChsAscii(Ljava/lang/String;)I
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    const-string v1, "gb2312"

    .line 3
    .line 4
    invoke-virtual {p1, v1}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    if-eqz p1, :cond_2

    .line 9
    .line 10
    array-length v1, p1

    .line 11
    const/4 v2, 0x2

    .line 12
    if-gt v1, v2, :cond_2

    .line 13
    .line 14
    array-length v1, p1

    .line 15
    if-lez v1, :cond_2

    .line 16
    .line 17
    array-length v1, p1

    .line 18
    const/4 v3, 0x1

    .line 19
    if-ne v1, v3, :cond_0

    .line 20
    .line 21
    aget-byte v1, p1, v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :catch_0
    move-exception p1

    .line 25
    goto :goto_1

    .line 26
    :cond_0
    move v1, v0

    .line 27
    :goto_0
    :try_start_1
    array-length v4, p1

    .line 28
    if-ne v4, v2, :cond_1

    .line 29
    .line 30
    aget-byte v0, p1, v0

    .line 31
    .line 32
    add-int/lit16 v0, v0, 0x100

    .line 33
    .line 34
    aget-byte p1, p1, v3
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 35
    .line 36
    add-int/lit16 p1, p1, 0x100

    .line 37
    .line 38
    mul-int/lit16 v0, v0, 0x100

    .line 39
    .line 40
    add-int/2addr v0, p1

    .line 41
    const/high16 p1, 0x10000

    .line 42
    .line 43
    sub-int/2addr v0, p1

    .line 44
    return v0

    .line 45
    :catch_1
    move-exception p1

    .line 46
    move v0, v1

    .line 47
    goto :goto_1

    .line 48
    :cond_1
    return v1

    .line 49
    :cond_2
    :try_start_2
    new-instance p1, Ljava/lang/RuntimeException;

    .line 50
    .line 51
    const-string v1, "illegal resource string"

    .line 52
    .line 53
    invoke-direct {p1, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    throw p1
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 57
    :goto_1
    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 58
    .line 59
    new-instance v2, Ljava/lang/StringBuilder;

    .line 60
    .line 61
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 62
    .line 63
    .line 64
    const-string v3, "ERROR:ChineseSpelling.class-getChsAscii(String chs)"

    .line 65
    .line 66
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    invoke-virtual {v1, p1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    return v0
.end method

.method public static getInstance()Lcom/lljjcoder/style/citylist/sortlistview/CharacterParser;
    .locals 1

    .line 1
    sget-object v0, Lcom/lljjcoder/style/citylist/sortlistview/CharacterParser;->characterParser:Lcom/lljjcoder/style/citylist/sortlistview/CharacterParser;

    .line 2
    .line 3
    return-object v0
.end method


# virtual methods
.method public convert(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    invoke-direct {p0, p1}, Lcom/lljjcoder/style/citylist/sortlistview/CharacterParser;->getChsAscii(Ljava/lang/String;)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-lez p1, :cond_0

    .line 6
    .line 7
    const/16 v0, 0xa0

    .line 8
    .line 9
    if-ge p1, v0, :cond_0

    .line 10
    .line 11
    int-to-char p1, p1

    .line 12
    invoke-static {p1}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    return-object p1

    .line 17
    :cond_0
    sget-object v0, Lcom/lljjcoder/style/citylist/sortlistview/CharacterParser;->pyvalue:[I

    .line 18
    .line 19
    array-length v0, v0

    .line 20
    add-int/lit8 v0, v0, -0x1

    .line 21
    .line 22
    :goto_0
    if-ltz v0, :cond_2

    .line 23
    .line 24
    sget-object v1, Lcom/lljjcoder/style/citylist/sortlistview/CharacterParser;->pyvalue:[I

    .line 25
    .line 26
    aget v1, v1, v0

    .line 27
    .line 28
    if-gt v1, p1, :cond_1

    .line 29
    .line 30
    sget-object p1, Lcom/lljjcoder/style/citylist/sortlistview/CharacterParser;->pystr:[Ljava/lang/String;

    .line 31
    .line 32
    aget-object p1, p1, v0

    .line 33
    .line 34
    return-object p1

    .line 35
    :cond_1
    add-int/lit8 v0, v0, -0x1

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_2
    const/4 p1, 0x0

    .line 39
    return-object p1
.end method

.method public getResource()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/lljjcoder/style/citylist/sortlistview/CharacterParser;->resource:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public getSelling(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object v0, p0, Lcom/lljjcoder/style/citylist/sortlistview/CharacterParser;->buffer:Ljava/lang/StringBuilder;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    :goto_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-ge v0, v1, :cond_1

    .line 14
    .line 15
    add-int/lit8 v1, v0, 0x1

    .line 16
    .line 17
    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    array-length v2, v2

    .line 26
    const/4 v3, 0x2

    .line 27
    if-lt v2, v3, :cond_0

    .line 28
    .line 29
    invoke-virtual {p0, v0}, Lcom/lljjcoder/style/citylist/sortlistview/CharacterParser;->convert(Ljava/lang/String;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    if-nez v0, :cond_0

    .line 34
    .line 35
    const-string v0, "unknown"

    .line 36
    .line 37
    :cond_0
    iget-object v2, p0, Lcom/lljjcoder/style/citylist/sortlistview/CharacterParser;->buffer:Ljava/lang/StringBuilder;

    .line 38
    .line 39
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    move v0, v1

    .line 43
    goto :goto_0

    .line 44
    :cond_1
    iget-object p1, p0, Lcom/lljjcoder/style/citylist/sortlistview/CharacterParser;->buffer:Ljava/lang/StringBuilder;

    .line 45
    .line 46
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    return-object p1
.end method

.method public getSpelling()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/lljjcoder/style/citylist/sortlistview/CharacterParser;->getResource()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0, v0}, Lcom/lljjcoder/style/citylist/sortlistview/CharacterParser;->getSelling(Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public setResource(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/lljjcoder/style/citylist/sortlistview/CharacterParser;->resource:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method
