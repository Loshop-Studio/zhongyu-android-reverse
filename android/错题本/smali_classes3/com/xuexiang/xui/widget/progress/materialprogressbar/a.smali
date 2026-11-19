.class public abstract Lcom/xuexiang/xui/widget/progress/materialprogressbar/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Landroid/graphics/Path;

.field public static final b:Landroid/graphics/Path;

.field public static final c:Landroid/graphics/Path;

.field public static final d:Landroid/graphics/Path;


# direct methods
.method static constructor <clinit>()V
    .locals 15

    .line 1
    new-instance v0, Landroid/graphics/Path;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/a;->a:Landroid/graphics/Path;

    .line 7
    .line 8
    const v1, -0x3bfd599a    # -522.6f

    .line 9
    .line 10
    .line 11
    const/4 v7, 0x0

    .line 12
    invoke-virtual {v0, v1, v7}, Landroid/graphics/Path;->moveTo(FF)V

    .line 13
    .line 14
    .line 15
    const v5, 0x43969bd0

    .line 16
    .line 17
    .line 18
    const/4 v6, 0x0

    .line 19
    const v1, 0x42439950

    .line 20
    .line 21
    .line 22
    const/4 v2, 0x0

    .line 23
    const v3, 0x432606cd

    .line 24
    .line 25
    .line 26
    const/4 v4, 0x0

    .line 27
    invoke-virtual/range {v0 .. v6}, Landroid/graphics/Path;->rCubicTo(FFFFFF)V

    .line 28
    .line 29
    .line 30
    const v5, 0x43d27dc9

    .line 31
    .line 32
    .line 33
    const v1, 0x434594cf

    .line 34
    .line 35
    .line 36
    const v3, 0x43d27dc9

    .line 37
    .line 38
    .line 39
    invoke-virtual/range {v0 .. v6}, Landroid/graphics/Path;->rCubicTo(FFFFFF)V

    .line 40
    .line 41
    .line 42
    new-instance v0, Landroid/graphics/Path;

    .line 43
    .line 44
    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    .line 45
    .line 46
    .line 47
    sput-object v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/a;->b:Landroid/graphics/Path;

    .line 48
    .line 49
    const v1, 0x3dcccccd    # 0.1f

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0, v7, v1}, Landroid/graphics/Path;->moveTo(FF)V

    .line 53
    .line 54
    .line 55
    const v2, 0x3f53ac64

    .line 56
    .line 57
    .line 58
    const/high16 v3, 0x3f800000    # 1.0f

    .line 59
    .line 60
    invoke-virtual {v0, v3, v2}, Landroid/graphics/Path;->lineTo(FF)V

    .line 61
    .line 62
    .line 63
    const/high16 v2, 0x40000000    # 2.0f

    .line 64
    .line 65
    invoke-virtual {v0, v2, v1}, Landroid/graphics/Path;->lineTo(FF)V

    .line 66
    .line 67
    .line 68
    new-instance v8, Landroid/graphics/Path;

    .line 69
    .line 70
    invoke-direct {v8}, Landroid/graphics/Path;-><init>()V

    .line 71
    .line 72
    .line 73
    sput-object v8, Lcom/xuexiang/xui/widget/progress/materialprogressbar/a;->c:Landroid/graphics/Path;

    .line 74
    .line 75
    const v0, -0x3cba6666    # -197.6f

    .line 76
    .line 77
    .line 78
    invoke-virtual {v8, v0, v7}, Landroid/graphics/Path;->moveTo(FF)V

    .line 79
    .line 80
    .line 81
    const v13, 0x43078c01

    .line 82
    .line 83
    .line 84
    const/4 v14, 0x0

    .line 85
    const v9, 0x41648256

    .line 86
    .line 87
    .line 88
    const/4 v10, 0x0

    .line 89
    const v11, 0x42aa27d8

    .line 90
    .line 91
    .line 92
    const/4 v12, 0x0

    .line 93
    invoke-virtual/range {v8 .. v14}, Landroid/graphics/Path;->rCubicTo(FFFFFF)V

    .line 94
    .line 95
    .line 96
    const v13, 0x43283e4a

    .line 97
    .line 98
    .line 99
    const v9, 0x42590c32

    .line 100
    .line 101
    .line 102
    const v11, 0x42b4d966

    .line 103
    .line 104
    .line 105
    invoke-virtual/range {v8 .. v14}, Landroid/graphics/Path;->rCubicTo(FFFFFF)V

    .line 106
    .line 107
    .line 108
    const v13, 0x439e3475

    .line 109
    .line 110
    .line 111
    const v9, 0x4310b8b7

    .line 112
    .line 113
    .line 114
    const v11, 0x439e3475

    .line 115
    .line 116
    .line 117
    invoke-virtual/range {v8 .. v14}, Landroid/graphics/Path;->rCubicTo(FFFFFF)V

    .line 118
    .line 119
    .line 120
    new-instance v0, Landroid/graphics/Path;

    .line 121
    .line 122
    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    .line 123
    .line 124
    .line 125
    sput-object v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/a;->d:Landroid/graphics/Path;

    .line 126
    .line 127
    invoke-virtual {v0, v7, v1}, Landroid/graphics/Path;->moveTo(FF)V

    .line 128
    .line 129
    .line 130
    const v4, 0x3f1245ed

    .line 131
    .line 132
    .line 133
    invoke-virtual {v0, v3, v4}, Landroid/graphics/Path;->lineTo(FF)V

    .line 134
    .line 135
    .line 136
    const v3, 0x3f68f280

    .line 137
    .line 138
    .line 139
    invoke-virtual {v0, v2, v3}, Landroid/graphics/Path;->lineTo(FF)V

    .line 140
    .line 141
    .line 142
    const/high16 v2, 0x40400000    # 3.0f

    .line 143
    .line 144
    invoke-virtual {v0, v2, v1}, Landroid/graphics/Path;->lineTo(FF)V

    .line 145
    .line 146
    .line 147
    return-void
.end method
