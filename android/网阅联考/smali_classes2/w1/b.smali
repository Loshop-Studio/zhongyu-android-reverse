.class public abstract Lw1/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Landroidx/compose/material3/Typography;


# direct methods
.method public static constructor <clinit>()V
    .locals 49

    .line 1
    new-instance v18, Landroidx/compose/material3/Typography;

    .line 2
    .line 3
    move-object/from16 v0, v18

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x0

    .line 7
    const/4 v3, 0x0

    .line 8
    const/4 v4, 0x0

    .line 9
    const/4 v5, 0x0

    .line 10
    const/4 v6, 0x0

    .line 11
    const/4 v7, 0x0

    .line 12
    const/4 v8, 0x0

    .line 13
    const/4 v9, 0x0

    .line 14
    sget-object v10, Landroidx/compose/ui/text/font/FontFamily;->Companion:Landroidx/compose/ui/text/font/FontFamily$Companion;

    .line 15
    .line 16
    invoke-virtual {v10}, Landroidx/compose/ui/text/font/FontFamily$Companion;->getDefault()Landroidx/compose/ui/text/font/SystemFontFamily;

    .line 17
    .line 18
    .line 19
    move-result-object v27

    .line 20
    sget-object v10, Landroidx/compose/ui/text/font/FontWeight;->Companion:Landroidx/compose/ui/text/font/FontWeight$Companion;

    .line 21
    .line 22
    invoke-virtual {v10}, Landroidx/compose/ui/text/font/FontWeight$Companion;->getNormal()Landroidx/compose/ui/text/font/FontWeight;

    .line 23
    .line 24
    .line 25
    move-result-object v24

    .line 26
    const/16 v10, 0x10

    .line 27
    .line 28
    invoke-static {v10}, Landroidx/compose/ui/unit/TextUnitKt;->getSp(I)J

    .line 29
    .line 30
    .line 31
    move-result-wide v22

    .line 32
    const/16 v10, 0x18

    .line 33
    .line 34
    invoke-static {v10}, Landroidx/compose/ui/unit/TextUnitKt;->getSp(I)J

    .line 35
    .line 36
    .line 37
    move-result-wide v40

    .line 38
    const-wide/high16 v10, 0x3fe0000000000000L    # 0.5

    .line 39
    .line 40
    invoke-static {v10, v11}, Landroidx/compose/ui/unit/TextUnitKt;->getSp(D)J

    .line 41
    .line 42
    .line 43
    move-result-wide v29

    .line 44
    new-instance v19, Landroidx/compose/ui/text/TextStyle;

    .line 45
    .line 46
    move-object/from16 v10, v19

    .line 47
    .line 48
    const-wide/16 v20, 0x0

    .line 49
    .line 50
    const/16 v25, 0x0

    .line 51
    .line 52
    const/16 v26, 0x0

    .line 53
    .line 54
    const/16 v28, 0x0

    .line 55
    .line 56
    const/16 v31, 0x0

    .line 57
    .line 58
    const/16 v32, 0x0

    .line 59
    .line 60
    const/16 v33, 0x0

    .line 61
    .line 62
    const-wide/16 v34, 0x0

    .line 63
    .line 64
    const/16 v36, 0x0

    .line 65
    .line 66
    const/16 v37, 0x0

    .line 67
    .line 68
    const/16 v38, 0x0

    .line 69
    .line 70
    const/16 v39, 0x0

    .line 71
    .line 72
    const/16 v42, 0x0

    .line 73
    .line 74
    const/16 v43, 0x0

    .line 75
    .line 76
    const/16 v44, 0x0

    .line 77
    .line 78
    const/16 v45, 0x0

    .line 79
    .line 80
    const/16 v46, 0x0

    .line 81
    .line 82
    const v47, 0x3eff59

    .line 83
    .line 84
    .line 85
    const/16 v48, 0x0

    .line 86
    .line 87
    invoke-direct/range {v19 .. v48}, Landroidx/compose/ui/text/TextStyle;-><init>(JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextAlign;Landroidx/compose/ui/text/style/TextDirection;JLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformTextStyle;Landroidx/compose/ui/text/style/LineHeightStyle;Landroidx/compose/ui/text/style/LineBreak;Landroidx/compose/ui/text/style/Hyphens;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 88
    .line 89
    .line 90
    const/4 v11, 0x0

    .line 91
    const/4 v12, 0x0

    .line 92
    const/4 v13, 0x0

    .line 93
    const/4 v14, 0x0

    .line 94
    const/4 v15, 0x0

    .line 95
    const/16 v16, 0x7dff

    .line 96
    .line 97
    const/16 v17, 0x0

    .line 98
    .line 99
    invoke-direct/range {v0 .. v17}, Landroidx/compose/material3/Typography;-><init>(Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 100
    .line 101
    .line 102
    sput-object v18, Lw1/b;->a:Landroidx/compose/material3/Typography;

    .line 103
    .line 104
    return-void
.end method

.method public static final a()Landroidx/compose/material3/Typography;
    .locals 1

    .line 1
    sget-object v0, Lw1/b;->a:Landroidx/compose/material3/Typography;

    .line 2
    .line 3
    return-object v0
.end method
