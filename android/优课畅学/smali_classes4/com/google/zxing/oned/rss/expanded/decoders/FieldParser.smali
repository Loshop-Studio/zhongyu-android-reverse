.class final Lcom/google/zxing/oned/rss/expanded/decoders/FieldParser;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final FOUR_DIGIT_DATA_LENGTH:[[Ljava/lang/Object;

.field private static final THREE_DIGIT_DATA_LENGTH:[[Ljava/lang/Object;

.field private static final THREE_DIGIT_PLUS_DIGIT_DATA_LENGTH:[[Ljava/lang/Object;

.field private static final TWO_DIGIT_DATA_LENGTH:[[Ljava/lang/Object;

.field private static final VARIABLE_LENGTH:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 92

    .line 1
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/google/zxing/oned/rss/expanded/decoders/FieldParser;->VARIABLE_LENGTH:Ljava/lang/Object;

    const/16 v1, 0x12

    .line 2
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "00"

    filled-new-array {v2, v1}, [Ljava/lang/Object;

    move-result-object v3

    const/16 v2, 0xe

    .line 3
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const-string v4, "01"

    filled-new-array {v4, v2}, [Ljava/lang/Object;

    move-result-object v4

    const-string v5, "02"

    .line 4
    filled-new-array {v5, v2}, [Ljava/lang/Object;

    move-result-object v5

    const/16 v6, 0x14

    .line 5
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    const-string v7, "10"

    filled-new-array {v7, v0, v6}, [Ljava/lang/Object;

    move-result-object v7

    const/4 v8, 0x6

    .line 6
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    const-string v9, "11"

    filled-new-array {v9, v8}, [Ljava/lang/Object;

    move-result-object v9

    const-string v10, "12"

    .line 7
    filled-new-array {v10, v8}, [Ljava/lang/Object;

    move-result-object v10

    const-string v11, "13"

    .line 8
    filled-new-array {v11, v8}, [Ljava/lang/Object;

    move-result-object v11

    const-string v12, "15"

    .line 9
    filled-new-array {v12, v8}, [Ljava/lang/Object;

    move-result-object v12

    const-string v13, "17"

    .line 10
    filled-new-array {v13, v8}, [Ljava/lang/Object;

    move-result-object v13

    const/4 v14, 0x2

    .line 11
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    const-string v15, "20"

    filled-new-array {v15, v14}, [Ljava/lang/Object;

    move-result-object v15

    move-object/from16 v16, v3

    const-string v3, "21"

    .line 12
    filled-new-array {v3, v0, v6}, [Ljava/lang/Object;

    move-result-object v3

    const/16 v17, 0x1d

    move-object/from16 v18, v3

    .line 13
    invoke-static/range {v17 .. v17}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    move-object/from16 v17, v4

    const-string v4, "22"

    filled-new-array {v4, v0, v3}, [Ljava/lang/Object;

    move-result-object v3

    const/16 v4, 0x8

    .line 14
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    move-object/from16 v19, v3

    const-string v3, "30"

    filled-new-array {v3, v0, v4}, [Ljava/lang/Object;

    move-result-object v3

    move-object/from16 v20, v3

    const-string v3, "37"

    .line 15
    filled-new-array {v3, v0, v4}, [Ljava/lang/Object;

    move-result-object v3

    const/16 v4, 0x1e

    .line 16
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    move-object/from16 v21, v3

    const-string v3, "90"

    filled-new-array {v3, v0, v4}, [Ljava/lang/Object;

    move-result-object v3

    move-object/from16 v22, v3

    const-string v3, "91"

    .line 17
    filled-new-array {v3, v0, v4}, [Ljava/lang/Object;

    move-result-object v3

    move-object/from16 v23, v3

    const-string v3, "92"

    .line 18
    filled-new-array {v3, v0, v4}, [Ljava/lang/Object;

    move-result-object v3

    move-object/from16 v24, v3

    const-string v3, "93"

    .line 19
    filled-new-array {v3, v0, v4}, [Ljava/lang/Object;

    move-result-object v3

    move-object/from16 v25, v3

    const-string v3, "94"

    .line 20
    filled-new-array {v3, v0, v4}, [Ljava/lang/Object;

    move-result-object v3

    move-object/from16 v26, v3

    const-string v3, "95"

    .line 21
    filled-new-array {v3, v0, v4}, [Ljava/lang/Object;

    move-result-object v3

    move-object/from16 v27, v3

    const-string v3, "96"

    .line 22
    filled-new-array {v3, v0, v4}, [Ljava/lang/Object;

    move-result-object v3

    move-object/from16 v28, v3

    const-string v3, "97"

    .line 23
    filled-new-array {v3, v0, v4}, [Ljava/lang/Object;

    move-result-object v3

    move-object/from16 v29, v3

    const-string v3, "98"

    .line 24
    filled-new-array {v3, v0, v4}, [Ljava/lang/Object;

    move-result-object v3

    move-object/from16 v30, v3

    const-string v3, "99"

    .line 25
    filled-new-array {v3, v0, v4}, [Ljava/lang/Object;

    move-result-object v3

    move-object/from16 v31, v26

    move-object/from16 v26, v3

    move-object/from16 v3, v16

    move-object/from16 v16, v21

    move-object/from16 v21, v31

    move-object/from16 v31, v28

    move-object/from16 v28, v6

    move-object v6, v7

    move-object v7, v9

    move-object v9, v11

    move-object v11, v13

    move-object/from16 v13, v18

    move-object/from16 v18, v23

    move-object/from16 v23, v31

    move-object/from16 v31, v2

    move-object v2, v4

    move-object/from16 v32, v14

    move-object/from16 v4, v17

    move-object/from16 v14, v19

    move-object/from16 v17, v22

    move-object/from16 v19, v24

    move-object/from16 v22, v27

    move-object/from16 v24, v29

    move-object/from16 v27, v1

    move-object v1, v8

    move-object v8, v10

    move-object v10, v12

    move-object v12, v15

    move-object/from16 v15, v20

    move-object/from16 v20, v25

    move-object/from16 v25, v30

    filled-new-array/range {v3 .. v26}, [[Ljava/lang/Object;

    move-result-object v3

    sput-object v3, Lcom/google/zxing/oned/rss/expanded/decoders/FieldParser;->TWO_DIGIT_DATA_LENGTH:[[Ljava/lang/Object;

    .line 26
    const-string v3, "240"

    .line 27
    filled-new-array {v3, v0, v2}, [Ljava/lang/Object;

    move-result-object v4

    const-string v3, "241"

    .line 28
    filled-new-array {v3, v0, v2}, [Ljava/lang/Object;

    move-result-object v5

    const-string v3, "242"

    .line 29
    filled-new-array {v3, v0, v1}, [Ljava/lang/Object;

    move-result-object v6

    const-string v3, "250"

    .line 30
    filled-new-array {v3, v0, v2}, [Ljava/lang/Object;

    move-result-object v7

    const-string v3, "251"

    .line 31
    filled-new-array {v3, v0, v2}, [Ljava/lang/Object;

    move-result-object v8

    const/16 v3, 0x11

    .line 32
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const-string v9, "253"

    filled-new-array {v9, v0, v3}, [Ljava/lang/Object;

    move-result-object v9

    const-string v10, "254"

    move-object/from16 v11, v28

    .line 33
    filled-new-array {v10, v0, v11}, [Ljava/lang/Object;

    move-result-object v10

    const-string v12, "400"

    .line 34
    filled-new-array {v12, v0, v2}, [Ljava/lang/Object;

    move-result-object v12

    const-string v13, "401"

    .line 35
    filled-new-array {v13, v0, v2}, [Ljava/lang/Object;

    move-result-object v13

    const-string v14, "402"

    .line 36
    filled-new-array {v14, v3}, [Ljava/lang/Object;

    move-result-object v3

    const-string v14, "403"

    .line 37
    filled-new-array {v14, v0, v2}, [Ljava/lang/Object;

    move-result-object v14

    const/16 v15, 0xd

    .line 38
    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    move-object/from16 v16, v3

    const-string v3, "410"

    filled-new-array {v3, v15}, [Ljava/lang/Object;

    move-result-object v3

    move-object/from16 v17, v3

    const-string v3, "411"

    .line 39
    filled-new-array {v3, v15}, [Ljava/lang/Object;

    move-result-object v3

    move-object/from16 v18, v3

    const-string v3, "412"

    .line 40
    filled-new-array {v3, v15}, [Ljava/lang/Object;

    move-result-object v3

    move-object/from16 v19, v3

    const-string v3, "413"

    .line 41
    filled-new-array {v3, v15}, [Ljava/lang/Object;

    move-result-object v3

    move-object/from16 v20, v3

    const-string v3, "414"

    .line 42
    filled-new-array {v3, v15}, [Ljava/lang/Object;

    move-result-object v3

    move-object/from16 v21, v3

    const-string v3, "420"

    .line 43
    filled-new-array {v3, v0, v11}, [Ljava/lang/Object;

    move-result-object v3

    const/16 v22, 0xf

    move-object/from16 v23, v3

    .line 44
    invoke-static/range {v22 .. v22}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    move-object/from16 v22, v4

    const-string v4, "421"

    filled-new-array {v4, v0, v3}, [Ljava/lang/Object;

    move-result-object v4

    const/16 v24, 0x3

    move-object/from16 v25, v4

    .line 45
    invoke-static/range {v24 .. v24}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    move-object/from16 v24, v5

    const-string v5, "422"

    filled-new-array {v5, v4}, [Ljava/lang/Object;

    move-result-object v5

    move-object/from16 v26, v5

    const-string v5, "423"

    .line 46
    filled-new-array {v5, v0, v3}, [Ljava/lang/Object;

    move-result-object v5

    move-object/from16 v28, v5

    const-string v5, "424"

    .line 47
    filled-new-array {v5, v4}, [Ljava/lang/Object;

    move-result-object v5

    move-object/from16 v29, v5

    const-string v5, "425"

    .line 48
    filled-new-array {v5, v4}, [Ljava/lang/Object;

    move-result-object v5

    move-object/from16 v30, v5

    const-string v5, "426"

    .line 49
    filled-new-array {v5, v4}, [Ljava/lang/Object;

    move-result-object v4

    move-object/from16 v5, v26

    move-object/from16 v26, v4

    move-object/from16 v4, v22

    move-object/from16 v22, v5

    move-object/from16 v33, v11

    move-object v11, v12

    move-object v12, v13

    move-object/from16 v34, v15

    move-object/from16 v13, v16

    move-object/from16 v15, v17

    move-object/from16 v16, v18

    move-object/from16 v17, v19

    move-object/from16 v18, v20

    move-object/from16 v19, v21

    move-object/from16 v20, v23

    move-object/from16 v5, v24

    move-object/from16 v21, v25

    move-object/from16 v23, v28

    move-object/from16 v24, v29

    move-object/from16 v25, v30

    filled-new-array/range {v4 .. v26}, [[Ljava/lang/Object;

    move-result-object v4

    sput-object v4, Lcom/google/zxing/oned/rss/expanded/decoders/FieldParser;->THREE_DIGIT_DATA_LENGTH:[[Ljava/lang/Object;

    .line 50
    const-string v4, "310"

    .line 51
    filled-new-array {v4, v1}, [Ljava/lang/Object;

    move-result-object v35

    const-string v4, "311"

    .line 52
    filled-new-array {v4, v1}, [Ljava/lang/Object;

    move-result-object v36

    const-string v4, "312"

    .line 53
    filled-new-array {v4, v1}, [Ljava/lang/Object;

    move-result-object v37

    const-string v4, "313"

    .line 54
    filled-new-array {v4, v1}, [Ljava/lang/Object;

    move-result-object v38

    const-string v4, "314"

    .line 55
    filled-new-array {v4, v1}, [Ljava/lang/Object;

    move-result-object v39

    const-string v4, "315"

    .line 56
    filled-new-array {v4, v1}, [Ljava/lang/Object;

    move-result-object v40

    const-string v4, "316"

    .line 57
    filled-new-array {v4, v1}, [Ljava/lang/Object;

    move-result-object v41

    const-string v4, "320"

    .line 58
    filled-new-array {v4, v1}, [Ljava/lang/Object;

    move-result-object v42

    const-string v4, "321"

    .line 59
    filled-new-array {v4, v1}, [Ljava/lang/Object;

    move-result-object v43

    const-string v4, "322"

    .line 60
    filled-new-array {v4, v1}, [Ljava/lang/Object;

    move-result-object v44

    const-string v4, "323"

    .line 61
    filled-new-array {v4, v1}, [Ljava/lang/Object;

    move-result-object v45

    const-string v4, "324"

    .line 62
    filled-new-array {v4, v1}, [Ljava/lang/Object;

    move-result-object v46

    const-string v4, "325"

    .line 63
    filled-new-array {v4, v1}, [Ljava/lang/Object;

    move-result-object v47

    const-string v4, "326"

    .line 64
    filled-new-array {v4, v1}, [Ljava/lang/Object;

    move-result-object v48

    const-string v4, "327"

    .line 65
    filled-new-array {v4, v1}, [Ljava/lang/Object;

    move-result-object v49

    const-string v4, "328"

    .line 66
    filled-new-array {v4, v1}, [Ljava/lang/Object;

    move-result-object v50

    const-string v4, "329"

    .line 67
    filled-new-array {v4, v1}, [Ljava/lang/Object;

    move-result-object v51

    const-string v4, "330"

    .line 68
    filled-new-array {v4, v1}, [Ljava/lang/Object;

    move-result-object v52

    const-string v4, "331"

    .line 69
    filled-new-array {v4, v1}, [Ljava/lang/Object;

    move-result-object v53

    const-string v4, "332"

    .line 70
    filled-new-array {v4, v1}, [Ljava/lang/Object;

    move-result-object v54

    const-string v4, "333"

    .line 71
    filled-new-array {v4, v1}, [Ljava/lang/Object;

    move-result-object v55

    const-string v4, "334"

    .line 72
    filled-new-array {v4, v1}, [Ljava/lang/Object;

    move-result-object v56

    const-string v4, "335"

    .line 73
    filled-new-array {v4, v1}, [Ljava/lang/Object;

    move-result-object v57

    const-string v4, "336"

    .line 74
    filled-new-array {v4, v1}, [Ljava/lang/Object;

    move-result-object v58

    const-string v4, "340"

    .line 75
    filled-new-array {v4, v1}, [Ljava/lang/Object;

    move-result-object v59

    const-string v4, "341"

    .line 76
    filled-new-array {v4, v1}, [Ljava/lang/Object;

    move-result-object v60

    const-string v4, "342"

    .line 77
    filled-new-array {v4, v1}, [Ljava/lang/Object;

    move-result-object v61

    const-string v4, "343"

    .line 78
    filled-new-array {v4, v1}, [Ljava/lang/Object;

    move-result-object v62

    const-string v4, "344"

    .line 79
    filled-new-array {v4, v1}, [Ljava/lang/Object;

    move-result-object v63

    const-string v4, "345"

    .line 80
    filled-new-array {v4, v1}, [Ljava/lang/Object;

    move-result-object v64

    const-string v4, "346"

    .line 81
    filled-new-array {v4, v1}, [Ljava/lang/Object;

    move-result-object v65

    const-string v4, "347"

    .line 82
    filled-new-array {v4, v1}, [Ljava/lang/Object;

    move-result-object v66

    const-string v4, "348"

    .line 83
    filled-new-array {v4, v1}, [Ljava/lang/Object;

    move-result-object v67

    const-string v4, "349"

    .line 84
    filled-new-array {v4, v1}, [Ljava/lang/Object;

    move-result-object v68

    const-string v4, "350"

    .line 85
    filled-new-array {v4, v1}, [Ljava/lang/Object;

    move-result-object v69

    const-string v4, "351"

    .line 86
    filled-new-array {v4, v1}, [Ljava/lang/Object;

    move-result-object v70

    const-string v4, "352"

    .line 87
    filled-new-array {v4, v1}, [Ljava/lang/Object;

    move-result-object v71

    const-string v4, "353"

    .line 88
    filled-new-array {v4, v1}, [Ljava/lang/Object;

    move-result-object v72

    const-string v4, "354"

    .line 89
    filled-new-array {v4, v1}, [Ljava/lang/Object;

    move-result-object v73

    const-string v4, "355"

    .line 90
    filled-new-array {v4, v1}, [Ljava/lang/Object;

    move-result-object v74

    const-string v4, "356"

    .line 91
    filled-new-array {v4, v1}, [Ljava/lang/Object;

    move-result-object v75

    const-string v4, "357"

    .line 92
    filled-new-array {v4, v1}, [Ljava/lang/Object;

    move-result-object v76

    const-string v4, "360"

    .line 93
    filled-new-array {v4, v1}, [Ljava/lang/Object;

    move-result-object v77

    const-string v4, "361"

    .line 94
    filled-new-array {v4, v1}, [Ljava/lang/Object;

    move-result-object v78

    const-string v4, "362"

    .line 95
    filled-new-array {v4, v1}, [Ljava/lang/Object;

    move-result-object v79

    const-string v4, "363"

    .line 96
    filled-new-array {v4, v1}, [Ljava/lang/Object;

    move-result-object v80

    const-string v4, "364"

    .line 97
    filled-new-array {v4, v1}, [Ljava/lang/Object;

    move-result-object v81

    const-string v4, "365"

    .line 98
    filled-new-array {v4, v1}, [Ljava/lang/Object;

    move-result-object v82

    const-string v4, "366"

    .line 99
    filled-new-array {v4, v1}, [Ljava/lang/Object;

    move-result-object v83

    const-string v4, "367"

    .line 100
    filled-new-array {v4, v1}, [Ljava/lang/Object;

    move-result-object v84

    const-string v4, "368"

    .line 101
    filled-new-array {v4, v1}, [Ljava/lang/Object;

    move-result-object v85

    const-string v4, "369"

    .line 102
    filled-new-array {v4, v1}, [Ljava/lang/Object;

    move-result-object v86

    const-string v4, "390"

    .line 103
    filled-new-array {v4, v0, v3}, [Ljava/lang/Object;

    move-result-object v87

    const-string v4, "391"

    move-object/from16 v5, v27

    .line 104
    filled-new-array {v4, v0, v5}, [Ljava/lang/Object;

    move-result-object v88

    const-string v4, "392"

    .line 105
    filled-new-array {v4, v0, v3}, [Ljava/lang/Object;

    move-result-object v89

    const-string v3, "393"

    .line 106
    filled-new-array {v3, v0, v5}, [Ljava/lang/Object;

    move-result-object v90

    const-string v3, "703"

    .line 107
    filled-new-array {v3, v0, v2}, [Ljava/lang/Object;

    move-result-object v91

    filled-new-array/range {v35 .. v91}, [[Ljava/lang/Object;

    move-result-object v3

    sput-object v3, Lcom/google/zxing/oned/rss/expanded/decoders/FieldParser;->THREE_DIGIT_PLUS_DIGIT_DATA_LENGTH:[[Ljava/lang/Object;

    .line 108
    const-string v3, "7001"

    move-object/from16 v4, v34

    .line 109
    filled-new-array {v3, v4}, [Ljava/lang/Object;

    move-result-object v6

    const-string v3, "7002"

    .line 110
    filled-new-array {v3, v0, v2}, [Ljava/lang/Object;

    move-result-object v7

    const/16 v3, 0xa

    .line 111
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const-string v4, "7003"

    filled-new-array {v4, v3}, [Ljava/lang/Object;

    move-result-object v8

    const-string v4, "8001"

    move-object/from16 v9, v31

    .line 112
    filled-new-array {v4, v9}, [Ljava/lang/Object;

    move-result-object v9

    const-string v4, "8002"

    move-object/from16 v11, v33

    .line 113
    filled-new-array {v4, v0, v11}, [Ljava/lang/Object;

    move-result-object v10

    const-string v4, "8003"

    .line 114
    filled-new-array {v4, v0, v2}, [Ljava/lang/Object;

    move-result-object v11

    const-string v4, "8004"

    .line 115
    filled-new-array {v4, v0, v2}, [Ljava/lang/Object;

    move-result-object v12

    const-string v4, "8005"

    .line 116
    filled-new-array {v4, v1}, [Ljava/lang/Object;

    move-result-object v13

    const-string v4, "8006"

    .line 117
    filled-new-array {v4, v5}, [Ljava/lang/Object;

    move-result-object v14

    const-string v4, "8007"

    .line 118
    filled-new-array {v4, v0, v2}, [Ljava/lang/Object;

    move-result-object v15

    const/16 v2, 0xc

    .line 119
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const-string v4, "8008"

    filled-new-array {v4, v0, v2}, [Ljava/lang/Object;

    move-result-object v16

    const-string v2, "8018"

    .line 120
    filled-new-array {v2, v5}, [Ljava/lang/Object;

    move-result-object v17

    const/16 v2, 0x19

    .line 121
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const-string v4, "8020"

    filled-new-array {v4, v0, v2}, [Ljava/lang/Object;

    move-result-object v18

    const-string v2, "8100"

    .line 122
    filled-new-array {v2, v1}, [Ljava/lang/Object;

    move-result-object v19

    const-string v1, "8101"

    .line 123
    filled-new-array {v1, v3}, [Ljava/lang/Object;

    move-result-object v20

    const-string v1, "8102"

    move-object/from16 v2, v32

    .line 124
    filled-new-array {v1, v2}, [Ljava/lang/Object;

    move-result-object v21

    const/16 v1, 0x46

    .line 125
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "8110"

    filled-new-array {v2, v0, v1}, [Ljava/lang/Object;

    move-result-object v22

    const-string v2, "8200"

    .line 126
    filled-new-array {v2, v0, v1}, [Ljava/lang/Object;

    move-result-object v23

    filled-new-array/range {v6 .. v23}, [[Ljava/lang/Object;

    move-result-object v0

    sput-object v0, Lcom/google/zxing/oned/rss/expanded/decoders/FieldParser;->FOUR_DIGIT_DATA_LENGTH:[[Ljava/lang/Object;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static parseFieldsInGeneralPurpose(Ljava/lang/String;)Ljava/lang/String;
    .locals 10

    .line 1
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x0

    .line 8
    return-object p0

    .line 9
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/4 v1, 0x2

    .line 14
    if-lt v0, v1, :cond_f

    .line 15
    .line 16
    const/4 v0, 0x0

    .line 17
    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    sget-object v3, Lcom/google/zxing/oned/rss/expanded/decoders/FieldParser;->TWO_DIGIT_DATA_LENGTH:[[Ljava/lang/Object;

    .line 22
    .line 23
    array-length v4, v3

    .line 24
    move v5, v0

    .line 25
    :goto_0
    const/4 v6, 0x1

    .line 26
    if-ge v5, v4, :cond_3

    .line 27
    .line 28
    aget-object v7, v3, v5

    .line 29
    .line 30
    aget-object v8, v7, v0

    .line 31
    .line 32
    invoke-virtual {v8, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v8

    .line 36
    if-eqz v8, :cond_2

    .line 37
    .line 38
    aget-object v0, v7, v6

    .line 39
    .line 40
    sget-object v2, Lcom/google/zxing/oned/rss/expanded/decoders/FieldParser;->VARIABLE_LENGTH:Ljava/lang/Object;

    .line 41
    .line 42
    if-ne v0, v2, :cond_1

    .line 43
    .line 44
    aget-object v0, v7, v1

    .line 45
    .line 46
    check-cast v0, Ljava/lang/Integer;

    .line 47
    .line 48
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    invoke-static {v1, v0, p0}, Lcom/google/zxing/oned/rss/expanded/decoders/FieldParser;->processVariableAI(IILjava/lang/String;)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    return-object p0

    .line 57
    :cond_1
    check-cast v0, Ljava/lang/Integer;

    .line 58
    .line 59
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    invoke-static {v1, v0, p0}, Lcom/google/zxing/oned/rss/expanded/decoders/FieldParser;->processFixedAI(IILjava/lang/String;)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    return-object p0

    .line 68
    :cond_2
    add-int/lit8 v5, v5, 0x1

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_3
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 72
    .line 73
    .line 74
    move-result v2

    .line 75
    const/4 v3, 0x3

    .line 76
    if-lt v2, v3, :cond_e

    .line 77
    .line 78
    invoke-virtual {p0, v0, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v2

    .line 82
    sget-object v4, Lcom/google/zxing/oned/rss/expanded/decoders/FieldParser;->THREE_DIGIT_DATA_LENGTH:[[Ljava/lang/Object;

    .line 83
    .line 84
    array-length v5, v4

    .line 85
    move v7, v0

    .line 86
    :goto_1
    if-ge v7, v5, :cond_6

    .line 87
    .line 88
    aget-object v8, v4, v7

    .line 89
    .line 90
    aget-object v9, v8, v0

    .line 91
    .line 92
    invoke-virtual {v9, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    move-result v9

    .line 96
    if-eqz v9, :cond_5

    .line 97
    .line 98
    aget-object v0, v8, v6

    .line 99
    .line 100
    sget-object v2, Lcom/google/zxing/oned/rss/expanded/decoders/FieldParser;->VARIABLE_LENGTH:Ljava/lang/Object;

    .line 101
    .line 102
    if-ne v0, v2, :cond_4

    .line 103
    .line 104
    aget-object v0, v8, v1

    .line 105
    .line 106
    check-cast v0, Ljava/lang/Integer;

    .line 107
    .line 108
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 109
    .line 110
    .line 111
    move-result v0

    .line 112
    invoke-static {v3, v0, p0}, Lcom/google/zxing/oned/rss/expanded/decoders/FieldParser;->processVariableAI(IILjava/lang/String;)Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object p0

    .line 116
    return-object p0

    .line 117
    :cond_4
    check-cast v0, Ljava/lang/Integer;

    .line 118
    .line 119
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 120
    .line 121
    .line 122
    move-result v0

    .line 123
    invoke-static {v3, v0, p0}, Lcom/google/zxing/oned/rss/expanded/decoders/FieldParser;->processFixedAI(IILjava/lang/String;)Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object p0

    .line 127
    return-object p0

    .line 128
    :cond_5
    add-int/lit8 v7, v7, 0x1

    .line 129
    .line 130
    goto :goto_1

    .line 131
    :cond_6
    sget-object v3, Lcom/google/zxing/oned/rss/expanded/decoders/FieldParser;->THREE_DIGIT_PLUS_DIGIT_DATA_LENGTH:[[Ljava/lang/Object;

    .line 132
    .line 133
    array-length v4, v3

    .line 134
    move v5, v0

    .line 135
    :goto_2
    const/4 v7, 0x4

    .line 136
    if-ge v5, v4, :cond_9

    .line 137
    .line 138
    aget-object v8, v3, v5

    .line 139
    .line 140
    aget-object v9, v8, v0

    .line 141
    .line 142
    invoke-virtual {v9, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 143
    .line 144
    .line 145
    move-result v9

    .line 146
    if-eqz v9, :cond_8

    .line 147
    .line 148
    aget-object v0, v8, v6

    .line 149
    .line 150
    sget-object v2, Lcom/google/zxing/oned/rss/expanded/decoders/FieldParser;->VARIABLE_LENGTH:Ljava/lang/Object;

    .line 151
    .line 152
    if-ne v0, v2, :cond_7

    .line 153
    .line 154
    aget-object v0, v8, v1

    .line 155
    .line 156
    check-cast v0, Ljava/lang/Integer;

    .line 157
    .line 158
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 159
    .line 160
    .line 161
    move-result v0

    .line 162
    invoke-static {v7, v0, p0}, Lcom/google/zxing/oned/rss/expanded/decoders/FieldParser;->processVariableAI(IILjava/lang/String;)Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object p0

    .line 166
    return-object p0

    .line 167
    :cond_7
    check-cast v0, Ljava/lang/Integer;

    .line 168
    .line 169
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 170
    .line 171
    .line 172
    move-result v0

    .line 173
    invoke-static {v7, v0, p0}, Lcom/google/zxing/oned/rss/expanded/decoders/FieldParser;->processFixedAI(IILjava/lang/String;)Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object p0

    .line 177
    return-object p0

    .line 178
    :cond_8
    add-int/lit8 v5, v5, 0x1

    .line 179
    .line 180
    goto :goto_2

    .line 181
    :cond_9
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 182
    .line 183
    .line 184
    move-result v2

    .line 185
    if-lt v2, v7, :cond_d

    .line 186
    .line 187
    invoke-virtual {p0, v0, v7}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 188
    .line 189
    .line 190
    move-result-object v2

    .line 191
    sget-object v3, Lcom/google/zxing/oned/rss/expanded/decoders/FieldParser;->FOUR_DIGIT_DATA_LENGTH:[[Ljava/lang/Object;

    .line 192
    .line 193
    array-length v4, v3

    .line 194
    move v5, v0

    .line 195
    :goto_3
    if-ge v5, v4, :cond_c

    .line 196
    .line 197
    aget-object v8, v3, v5

    .line 198
    .line 199
    aget-object v9, v8, v0

    .line 200
    .line 201
    invoke-virtual {v9, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 202
    .line 203
    .line 204
    move-result v9

    .line 205
    if-eqz v9, :cond_b

    .line 206
    .line 207
    aget-object v0, v8, v6

    .line 208
    .line 209
    sget-object v2, Lcom/google/zxing/oned/rss/expanded/decoders/FieldParser;->VARIABLE_LENGTH:Ljava/lang/Object;

    .line 210
    .line 211
    if-ne v0, v2, :cond_a

    .line 212
    .line 213
    aget-object v0, v8, v1

    .line 214
    .line 215
    check-cast v0, Ljava/lang/Integer;

    .line 216
    .line 217
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 218
    .line 219
    .line 220
    move-result v0

    .line 221
    invoke-static {v7, v0, p0}, Lcom/google/zxing/oned/rss/expanded/decoders/FieldParser;->processVariableAI(IILjava/lang/String;)Ljava/lang/String;

    .line 222
    .line 223
    .line 224
    move-result-object p0

    .line 225
    return-object p0

    .line 226
    :cond_a
    check-cast v0, Ljava/lang/Integer;

    .line 227
    .line 228
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 229
    .line 230
    .line 231
    move-result v0

    .line 232
    invoke-static {v7, v0, p0}, Lcom/google/zxing/oned/rss/expanded/decoders/FieldParser;->processFixedAI(IILjava/lang/String;)Ljava/lang/String;

    .line 233
    .line 234
    .line 235
    move-result-object p0

    .line 236
    return-object p0

    .line 237
    :cond_b
    add-int/lit8 v5, v5, 0x1

    .line 238
    .line 239
    goto :goto_3

    .line 240
    :cond_c
    invoke-static {}, Lcom/google/zxing/NotFoundException;->getNotFoundInstance()Lcom/google/zxing/NotFoundException;

    .line 241
    .line 242
    .line 243
    move-result-object p0

    .line 244
    throw p0

    .line 245
    :cond_d
    invoke-static {}, Lcom/google/zxing/NotFoundException;->getNotFoundInstance()Lcom/google/zxing/NotFoundException;

    .line 246
    .line 247
    .line 248
    move-result-object p0

    .line 249
    throw p0

    .line 250
    :cond_e
    invoke-static {}, Lcom/google/zxing/NotFoundException;->getNotFoundInstance()Lcom/google/zxing/NotFoundException;

    .line 251
    .line 252
    .line 253
    move-result-object p0

    .line 254
    throw p0

    .line 255
    :cond_f
    invoke-static {}, Lcom/google/zxing/NotFoundException;->getNotFoundInstance()Lcom/google/zxing/NotFoundException;

    .line 256
    .line 257
    .line 258
    move-result-object p0

    .line 259
    throw p0
.end method

.method private static processFixedAI(IILjava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-lt v0, p0, :cond_2

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    invoke-virtual {p2, v0, p0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    add-int/2addr p1, p0

    .line 17
    if-lt v1, p1, :cond_1

    .line 18
    .line 19
    invoke-virtual {p2, p0, p1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    invoke-virtual {p2, p1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    new-instance p2, Ljava/lang/StringBuilder;

    .line 28
    .line 29
    const-string v1, "("

    .line 30
    .line 31
    invoke-direct {p2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    const/16 v0, 0x29

    .line 38
    .line 39
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    invoke-static {p1}, Lcom/google/zxing/oned/rss/expanded/decoders/FieldParser;->parseFieldsInGeneralPurpose(Ljava/lang/String;)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    if-nez p1, :cond_0

    .line 54
    .line 55
    return-object p0

    .line 56
    :cond_0
    new-instance p2, Ljava/lang/StringBuilder;

    .line 57
    .line 58
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 59
    .line 60
    .line 61
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    return-object p0

    .line 72
    :cond_1
    invoke-static {}, Lcom/google/zxing/NotFoundException;->getNotFoundInstance()Lcom/google/zxing/NotFoundException;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    throw p0

    .line 77
    :cond_2
    invoke-static {}, Lcom/google/zxing/NotFoundException;->getNotFoundInstance()Lcom/google/zxing/NotFoundException;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    throw p0
.end method

.method private static processVariableAI(IILjava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p2, v0, p0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    add-int/2addr p1, p0

    .line 11
    if-ge v1, p1, :cond_0

    .line 12
    .line 13
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    :cond_0
    invoke-virtual {p2, p0, p1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-virtual {p2, p1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    new-instance p2, Ljava/lang/StringBuilder;

    .line 26
    .line 27
    const-string v1, "("

    .line 28
    .line 29
    invoke-direct {p2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    const/16 v0, 0x29

    .line 36
    .line 37
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    invoke-static {p1}, Lcom/google/zxing/oned/rss/expanded/decoders/FieldParser;->parseFieldsInGeneralPurpose(Ljava/lang/String;)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    if-nez p1, :cond_1

    .line 52
    .line 53
    return-object p0

    .line 54
    :cond_1
    new-instance p2, Ljava/lang/StringBuilder;

    .line 55
    .line 56
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    return-object p0
.end method
