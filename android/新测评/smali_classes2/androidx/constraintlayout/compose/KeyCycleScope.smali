.class public final Landroidx/constraintlayout/compose/KeyCycleScope;
.super Landroidx/constraintlayout/compose/BaseKeyFrameScope;
.source "SourceFile"


# annotations
.annotation runtime Landroidx/compose/foundation/layout/LayoutScopeMarker;
.end annotation

.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation build Landroidx/constraintlayout/compose/ExperimentalMotionApi;
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0002\u0008\'\n\u0002\u0018\u0002\n\u0002\u0008\r\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u0008\u0000\u00a2\u0006\u0002\u0010\u0002R+\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008\n\u0010\u000b\u001a\u0004\u0008\u0006\u0010\u0007\"\u0004\u0008\u0008\u0010\tR+\u0010\u000c\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008\u000f\u0010\u000b\u001a\u0004\u0008\r\u0010\u0007\"\u0004\u0008\u000e\u0010\tR+\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008\u0013\u0010\u000b\u001a\u0004\u0008\u0011\u0010\u0007\"\u0004\u0008\u0012\u0010\tR+\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008\u0017\u0010\u000b\u001a\u0004\u0008\u0015\u0010\u0007\"\u0004\u0008\u0016\u0010\tR+\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008\u001b\u0010\u000b\u001a\u0004\u0008\u0019\u0010\u0007\"\u0004\u0008\u001a\u0010\tR+\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008\u001f\u0010\u000b\u001a\u0004\u0008\u001d\u0010\u0007\"\u0004\u0008\u001e\u0010\tR+\u0010 \u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008#\u0010\u000b\u001a\u0004\u0008!\u0010\u0007\"\u0004\u0008\"\u0010\tR+\u0010$\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008\'\u0010\u000b\u001a\u0004\u0008%\u0010\u0007\"\u0004\u0008&\u0010\tR+\u0010(\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008+\u0010\u000b\u001a\u0004\u0008)\u0010\u0007\"\u0004\u0008*\u0010\tR1\u0010-\u001a\u00020,2\u0006\u0010\u0003\u001a\u00020,8F@FX\u0086\u008e\u0002\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0012\n\u0004\u00080\u0010\u000b\u001a\u0004\u0008.\u0010\u0007\"\u0004\u0008/\u0010\tR1\u00101\u001a\u00020,2\u0006\u0010\u0003\u001a\u00020,8F@FX\u0086\u008e\u0002\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0012\n\u0004\u00084\u0010\u000b\u001a\u0004\u00082\u0010\u0007\"\u0004\u00083\u0010\tR1\u00105\u001a\u00020,2\u0006\u0010\u0003\u001a\u00020,8F@FX\u0086\u008e\u0002\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0012\n\u0004\u00088\u0010\u000b\u001a\u0004\u00086\u0010\u0007\"\u0004\u00087\u0010\t\u0082\u0002\u000b\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008!\u00a8\u00069"
    }
    d2 = {
        "Landroidx/constraintlayout/compose/KeyCycleScope;",
        "Landroidx/constraintlayout/compose/BaseKeyFrameScope;",
        "()V",
        "<set-?>",
        "",
        "alpha",
        "getAlpha",
        "()F",
        "setAlpha",
        "(F)V",
        "alpha$delegate",
        "Lkotlin/properties/ObservableProperty;",
        "offset",
        "getOffset",
        "setOffset",
        "offset$delegate",
        "period",
        "getPeriod",
        "setPeriod",
        "period$delegate",
        "phase",
        "getPhase",
        "setPhase",
        "phase$delegate",
        "rotationX",
        "getRotationX",
        "setRotationX",
        "rotationX$delegate",
        "rotationY",
        "getRotationY",
        "setRotationY",
        "rotationY$delegate",
        "rotationZ",
        "getRotationZ",
        "setRotationZ",
        "rotationZ$delegate",
        "scaleX",
        "getScaleX",
        "setScaleX",
        "scaleX$delegate",
        "scaleY",
        "getScaleY",
        "setScaleY",
        "scaleY$delegate",
        "Landroidx/compose/ui/unit/Dp;",
        "translationX",
        "getTranslationX-D9Ej5fM",
        "setTranslationX-0680j_4",
        "translationX$delegate",
        "translationY",
        "getTranslationY-D9Ej5fM",
        "setTranslationY-0680j_4",
        "translationY$delegate",
        "translationZ",
        "getTranslationZ-D9Ej5fM",
        "setTranslationZ-0680j_4",
        "translationZ$delegate",
        "constraintlayout-compose_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nTransitionScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransitionScope.kt\nandroidx/constraintlayout/compose/KeyCycleScope\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,969:1\n149#2:970\n149#2:971\n149#2:972\n*S KotlinDebug\n*F\n+ 1 TransitionScope.kt\nandroidx/constraintlayout/compose/KeyCycleScope\n*L\n594#1:970\n595#1:971\n596#1:972\n*E\n"
    }
.end annotation


# static fields
.field static final synthetic $$delegatedProperties:[Lkotlin/reflect/KProperty;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Lkotlin/reflect/KProperty<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field public static final $stable:I


# instance fields
.field private final alpha$delegate:Lkotlin/properties/ObservableProperty;

.field private final offset$delegate:Lkotlin/properties/ObservableProperty;

.field private final period$delegate:Lkotlin/properties/ObservableProperty;

.field private final phase$delegate:Lkotlin/properties/ObservableProperty;

.field private final rotationX$delegate:Lkotlin/properties/ObservableProperty;

.field private final rotationY$delegate:Lkotlin/properties/ObservableProperty;

.field private final rotationZ$delegate:Lkotlin/properties/ObservableProperty;

.field private final scaleX$delegate:Lkotlin/properties/ObservableProperty;

.field private final scaleY$delegate:Lkotlin/properties/ObservableProperty;

.field private final translationX$delegate:Lkotlin/properties/ObservableProperty;

.field private final translationY$delegate:Lkotlin/properties/ObservableProperty;

.field private final translationZ$delegate:Lkotlin/properties/ObservableProperty;


# direct methods
.method static constructor <clinit>()V
    .locals 16

    .line 1
    new-instance v0, Lkotlin/jvm/internal/MutablePropertyReference1Impl;

    .line 2
    .line 3
    const-class v1, Landroidx/constraintlayout/compose/KeyCycleScope;

    .line 4
    .line 5
    const-string v2, "alpha"

    .line 6
    .line 7
    const-string v3, "getAlpha()F"

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-direct {v0, v1, v2, v3, v4}, Lkotlin/jvm/internal/MutablePropertyReference1Impl;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 11
    .line 12
    .line 13
    invoke-static {v0}, Lkotlin/jvm/internal/Reflection;->mutableProperty1(Lkotlin/jvm/internal/MutablePropertyReference1;)Lkotlin/reflect/KMutableProperty1;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    new-instance v2, Lkotlin/jvm/internal/MutablePropertyReference1Impl;

    .line 18
    .line 19
    const-string/jumbo v3, "scaleX"

    .line 20
    .line 21
    .line 22
    const-string v5, "getScaleX()F"

    .line 23
    .line 24
    invoke-direct {v2, v1, v3, v5, v4}, Lkotlin/jvm/internal/MutablePropertyReference1Impl;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 25
    .line 26
    .line 27
    invoke-static {v2}, Lkotlin/jvm/internal/Reflection;->mutableProperty1(Lkotlin/jvm/internal/MutablePropertyReference1;)Lkotlin/reflect/KMutableProperty1;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    new-instance v3, Lkotlin/jvm/internal/MutablePropertyReference1Impl;

    .line 32
    .line 33
    const-string/jumbo v5, "scaleY"

    .line 34
    .line 35
    .line 36
    const-string v6, "getScaleY()F"

    .line 37
    .line 38
    invoke-direct {v3, v1, v5, v6, v4}, Lkotlin/jvm/internal/MutablePropertyReference1Impl;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 39
    .line 40
    .line 41
    invoke-static {v3}, Lkotlin/jvm/internal/Reflection;->mutableProperty1(Lkotlin/jvm/internal/MutablePropertyReference1;)Lkotlin/reflect/KMutableProperty1;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    new-instance v5, Lkotlin/jvm/internal/MutablePropertyReference1Impl;

    .line 46
    .line 47
    const-string/jumbo v6, "rotationX"

    .line 48
    .line 49
    .line 50
    const-string v7, "getRotationX()F"

    .line 51
    .line 52
    invoke-direct {v5, v1, v6, v7, v4}, Lkotlin/jvm/internal/MutablePropertyReference1Impl;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 53
    .line 54
    .line 55
    invoke-static {v5}, Lkotlin/jvm/internal/Reflection;->mutableProperty1(Lkotlin/jvm/internal/MutablePropertyReference1;)Lkotlin/reflect/KMutableProperty1;

    .line 56
    .line 57
    .line 58
    move-result-object v5

    .line 59
    new-instance v6, Lkotlin/jvm/internal/MutablePropertyReference1Impl;

    .line 60
    .line 61
    const-string/jumbo v7, "rotationY"

    .line 62
    .line 63
    .line 64
    const-string v8, "getRotationY()F"

    .line 65
    .line 66
    invoke-direct {v6, v1, v7, v8, v4}, Lkotlin/jvm/internal/MutablePropertyReference1Impl;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 67
    .line 68
    .line 69
    invoke-static {v6}, Lkotlin/jvm/internal/Reflection;->mutableProperty1(Lkotlin/jvm/internal/MutablePropertyReference1;)Lkotlin/reflect/KMutableProperty1;

    .line 70
    .line 71
    .line 72
    move-result-object v6

    .line 73
    new-instance v7, Lkotlin/jvm/internal/MutablePropertyReference1Impl;

    .line 74
    .line 75
    const-string/jumbo v8, "rotationZ"

    .line 76
    .line 77
    .line 78
    const-string v9, "getRotationZ()F"

    .line 79
    .line 80
    invoke-direct {v7, v1, v8, v9, v4}, Lkotlin/jvm/internal/MutablePropertyReference1Impl;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 81
    .line 82
    .line 83
    invoke-static {v7}, Lkotlin/jvm/internal/Reflection;->mutableProperty1(Lkotlin/jvm/internal/MutablePropertyReference1;)Lkotlin/reflect/KMutableProperty1;

    .line 84
    .line 85
    .line 86
    move-result-object v7

    .line 87
    new-instance v8, Lkotlin/jvm/internal/MutablePropertyReference1Impl;

    .line 88
    .line 89
    const-string/jumbo v9, "translationX"

    .line 90
    .line 91
    .line 92
    const-string v10, "getTranslationX-D9Ej5fM()F"

    .line 93
    .line 94
    invoke-direct {v8, v1, v9, v10, v4}, Lkotlin/jvm/internal/MutablePropertyReference1Impl;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 95
    .line 96
    .line 97
    invoke-static {v8}, Lkotlin/jvm/internal/Reflection;->mutableProperty1(Lkotlin/jvm/internal/MutablePropertyReference1;)Lkotlin/reflect/KMutableProperty1;

    .line 98
    .line 99
    .line 100
    move-result-object v8

    .line 101
    new-instance v9, Lkotlin/jvm/internal/MutablePropertyReference1Impl;

    .line 102
    .line 103
    const-string/jumbo v10, "translationY"

    .line 104
    .line 105
    .line 106
    const-string v11, "getTranslationY-D9Ej5fM()F"

    .line 107
    .line 108
    invoke-direct {v9, v1, v10, v11, v4}, Lkotlin/jvm/internal/MutablePropertyReference1Impl;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 109
    .line 110
    .line 111
    invoke-static {v9}, Lkotlin/jvm/internal/Reflection;->mutableProperty1(Lkotlin/jvm/internal/MutablePropertyReference1;)Lkotlin/reflect/KMutableProperty1;

    .line 112
    .line 113
    .line 114
    move-result-object v9

    .line 115
    new-instance v10, Lkotlin/jvm/internal/MutablePropertyReference1Impl;

    .line 116
    .line 117
    const-string/jumbo v11, "translationZ"

    .line 118
    .line 119
    .line 120
    const-string v12, "getTranslationZ-D9Ej5fM()F"

    .line 121
    .line 122
    invoke-direct {v10, v1, v11, v12, v4}, Lkotlin/jvm/internal/MutablePropertyReference1Impl;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 123
    .line 124
    .line 125
    invoke-static {v10}, Lkotlin/jvm/internal/Reflection;->mutableProperty1(Lkotlin/jvm/internal/MutablePropertyReference1;)Lkotlin/reflect/KMutableProperty1;

    .line 126
    .line 127
    .line 128
    move-result-object v10

    .line 129
    new-instance v11, Lkotlin/jvm/internal/MutablePropertyReference1Impl;

    .line 130
    .line 131
    const-string/jumbo v12, "period"

    .line 132
    .line 133
    .line 134
    const-string v13, "getPeriod()F"

    .line 135
    .line 136
    invoke-direct {v11, v1, v12, v13, v4}, Lkotlin/jvm/internal/MutablePropertyReference1Impl;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 137
    .line 138
    .line 139
    invoke-static {v11}, Lkotlin/jvm/internal/Reflection;->mutableProperty1(Lkotlin/jvm/internal/MutablePropertyReference1;)Lkotlin/reflect/KMutableProperty1;

    .line 140
    .line 141
    .line 142
    move-result-object v11

    .line 143
    new-instance v12, Lkotlin/jvm/internal/MutablePropertyReference1Impl;

    .line 144
    .line 145
    const-string/jumbo v13, "offset"

    .line 146
    .line 147
    .line 148
    const-string v14, "getOffset()F"

    .line 149
    .line 150
    invoke-direct {v12, v1, v13, v14, v4}, Lkotlin/jvm/internal/MutablePropertyReference1Impl;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 151
    .line 152
    .line 153
    invoke-static {v12}, Lkotlin/jvm/internal/Reflection;->mutableProperty1(Lkotlin/jvm/internal/MutablePropertyReference1;)Lkotlin/reflect/KMutableProperty1;

    .line 154
    .line 155
    .line 156
    move-result-object v12

    .line 157
    new-instance v13, Lkotlin/jvm/internal/MutablePropertyReference1Impl;

    .line 158
    .line 159
    const-string/jumbo v14, "phase"

    .line 160
    .line 161
    .line 162
    const-string v15, "getPhase()F"

    .line 163
    .line 164
    invoke-direct {v13, v1, v14, v15, v4}, Lkotlin/jvm/internal/MutablePropertyReference1Impl;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 165
    .line 166
    .line 167
    invoke-static {v13}, Lkotlin/jvm/internal/Reflection;->mutableProperty1(Lkotlin/jvm/internal/MutablePropertyReference1;)Lkotlin/reflect/KMutableProperty1;

    .line 168
    .line 169
    .line 170
    move-result-object v1

    .line 171
    const/16 v13, 0xc

    .line 172
    .line 173
    new-array v13, v13, [Lkotlin/reflect/KProperty;

    .line 174
    .line 175
    aput-object v0, v13, v4

    .line 176
    .line 177
    const/4 v0, 0x1

    .line 178
    aput-object v2, v13, v0

    .line 179
    .line 180
    const/4 v0, 0x2

    .line 181
    aput-object v3, v13, v0

    .line 182
    .line 183
    const/4 v0, 0x3

    .line 184
    aput-object v5, v13, v0

    .line 185
    .line 186
    const/4 v0, 0x4

    .line 187
    aput-object v6, v13, v0

    .line 188
    .line 189
    const/4 v0, 0x5

    .line 190
    aput-object v7, v13, v0

    .line 191
    .line 192
    const/4 v0, 0x6

    .line 193
    aput-object v8, v13, v0

    .line 194
    .line 195
    const/4 v0, 0x7

    .line 196
    aput-object v9, v13, v0

    .line 197
    .line 198
    const/16 v0, 0x8

    .line 199
    .line 200
    aput-object v10, v13, v0

    .line 201
    .line 202
    const/16 v2, 0x9

    .line 203
    .line 204
    aput-object v11, v13, v2

    .line 205
    .line 206
    const/16 v2, 0xa

    .line 207
    .line 208
    aput-object v12, v13, v2

    .line 209
    .line 210
    const/16 v2, 0xb

    .line 211
    .line 212
    aput-object v1, v13, v2

    .line 213
    .line 214
    sput-object v13, Landroidx/constraintlayout/compose/KeyCycleScope;->$$delegatedProperties:[Lkotlin/reflect/KProperty;

    .line 215
    .line 216
    sput v0, Landroidx/constraintlayout/compose/KeyCycleScope;->$stable:I

    .line 217
    .line 218
    return-void
.end method

.method public constructor <init>()V
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0}, Landroidx/constraintlayout/compose/BaseKeyFrameScope;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 3
    .line 4
    .line 5
    const/high16 v1, 0x3f800000    # 1.0f

    .line 6
    .line 7
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    const/4 v2, 0x2

    .line 12
    invoke-static {p0, v1, v0, v2, v0}, Landroidx/constraintlayout/compose/BaseKeyFrameScope;->addOnPropertyChange$default(Landroidx/constraintlayout/compose/BaseKeyFrameScope;Ljava/lang/Object;Ljava/lang/String;ILjava/lang/Object;)Lkotlin/properties/ObservableProperty;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    iput-object v3, p0, Landroidx/constraintlayout/compose/KeyCycleScope;->alpha$delegate:Lkotlin/properties/ObservableProperty;

    .line 17
    .line 18
    invoke-static {p0, v1, v0, v2, v0}, Landroidx/constraintlayout/compose/BaseKeyFrameScope;->addOnPropertyChange$default(Landroidx/constraintlayout/compose/BaseKeyFrameScope;Ljava/lang/Object;Ljava/lang/String;ILjava/lang/Object;)Lkotlin/properties/ObservableProperty;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    iput-object v3, p0, Landroidx/constraintlayout/compose/KeyCycleScope;->scaleX$delegate:Lkotlin/properties/ObservableProperty;

    .line 23
    .line 24
    invoke-static {p0, v1, v0, v2, v0}, Landroidx/constraintlayout/compose/BaseKeyFrameScope;->addOnPropertyChange$default(Landroidx/constraintlayout/compose/BaseKeyFrameScope;Ljava/lang/Object;Ljava/lang/String;ILjava/lang/Object;)Lkotlin/properties/ObservableProperty;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    iput-object v1, p0, Landroidx/constraintlayout/compose/KeyCycleScope;->scaleY$delegate:Lkotlin/properties/ObservableProperty;

    .line 29
    .line 30
    const/4 v1, 0x0

    .line 31
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-static {p0, v1, v0, v2, v0}, Landroidx/constraintlayout/compose/BaseKeyFrameScope;->addOnPropertyChange$default(Landroidx/constraintlayout/compose/BaseKeyFrameScope;Ljava/lang/Object;Ljava/lang/String;ILjava/lang/Object;)Lkotlin/properties/ObservableProperty;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    iput-object v3, p0, Landroidx/constraintlayout/compose/KeyCycleScope;->rotationX$delegate:Lkotlin/properties/ObservableProperty;

    .line 40
    .line 41
    invoke-static {p0, v1, v0, v2, v0}, Landroidx/constraintlayout/compose/BaseKeyFrameScope;->addOnPropertyChange$default(Landroidx/constraintlayout/compose/BaseKeyFrameScope;Ljava/lang/Object;Ljava/lang/String;ILjava/lang/Object;)Lkotlin/properties/ObservableProperty;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    iput-object v3, p0, Landroidx/constraintlayout/compose/KeyCycleScope;->rotationY$delegate:Lkotlin/properties/ObservableProperty;

    .line 46
    .line 47
    invoke-static {p0, v1, v0, v2, v0}, Landroidx/constraintlayout/compose/BaseKeyFrameScope;->addOnPropertyChange$default(Landroidx/constraintlayout/compose/BaseKeyFrameScope;Ljava/lang/Object;Ljava/lang/String;ILjava/lang/Object;)Lkotlin/properties/ObservableProperty;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    iput-object v3, p0, Landroidx/constraintlayout/compose/KeyCycleScope;->rotationZ$delegate:Lkotlin/properties/ObservableProperty;

    .line 52
    .line 53
    const/4 v3, 0x0

    .line 54
    int-to-float v3, v3

    .line 55
    invoke-static {v3}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 56
    .line 57
    .line 58
    move-result v4

    .line 59
    invoke-static {v4}, Landroidx/compose/ui/unit/Dp;->box-impl(F)Landroidx/compose/ui/unit/Dp;

    .line 60
    .line 61
    .line 62
    move-result-object v4

    .line 63
    invoke-static {p0, v4, v0, v2, v0}, Landroidx/constraintlayout/compose/BaseKeyFrameScope;->addOnPropertyChange$default(Landroidx/constraintlayout/compose/BaseKeyFrameScope;Ljava/lang/Object;Ljava/lang/String;ILjava/lang/Object;)Lkotlin/properties/ObservableProperty;

    .line 64
    .line 65
    .line 66
    move-result-object v4

    .line 67
    iput-object v4, p0, Landroidx/constraintlayout/compose/KeyCycleScope;->translationX$delegate:Lkotlin/properties/ObservableProperty;

    .line 68
    .line 69
    invoke-static {v3}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 70
    .line 71
    .line 72
    move-result v4

    .line 73
    invoke-static {v4}, Landroidx/compose/ui/unit/Dp;->box-impl(F)Landroidx/compose/ui/unit/Dp;

    .line 74
    .line 75
    .line 76
    move-result-object v4

    .line 77
    invoke-static {p0, v4, v0, v2, v0}, Landroidx/constraintlayout/compose/BaseKeyFrameScope;->addOnPropertyChange$default(Landroidx/constraintlayout/compose/BaseKeyFrameScope;Ljava/lang/Object;Ljava/lang/String;ILjava/lang/Object;)Lkotlin/properties/ObservableProperty;

    .line 78
    .line 79
    .line 80
    move-result-object v4

    .line 81
    iput-object v4, p0, Landroidx/constraintlayout/compose/KeyCycleScope;->translationY$delegate:Lkotlin/properties/ObservableProperty;

    .line 82
    .line 83
    invoke-static {v3}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 84
    .line 85
    .line 86
    move-result v3

    .line 87
    invoke-static {v3}, Landroidx/compose/ui/unit/Dp;->box-impl(F)Landroidx/compose/ui/unit/Dp;

    .line 88
    .line 89
    .line 90
    move-result-object v3

    .line 91
    invoke-static {p0, v3, v0, v2, v0}, Landroidx/constraintlayout/compose/BaseKeyFrameScope;->addOnPropertyChange$default(Landroidx/constraintlayout/compose/BaseKeyFrameScope;Ljava/lang/Object;Ljava/lang/String;ILjava/lang/Object;)Lkotlin/properties/ObservableProperty;

    .line 92
    .line 93
    .line 94
    move-result-object v3

    .line 95
    iput-object v3, p0, Landroidx/constraintlayout/compose/KeyCycleScope;->translationZ$delegate:Lkotlin/properties/ObservableProperty;

    .line 96
    .line 97
    invoke-static {p0, v1, v0, v2, v0}, Landroidx/constraintlayout/compose/BaseKeyFrameScope;->addOnPropertyChange$default(Landroidx/constraintlayout/compose/BaseKeyFrameScope;Ljava/lang/Object;Ljava/lang/String;ILjava/lang/Object;)Lkotlin/properties/ObservableProperty;

    .line 98
    .line 99
    .line 100
    move-result-object v3

    .line 101
    iput-object v3, p0, Landroidx/constraintlayout/compose/KeyCycleScope;->period$delegate:Lkotlin/properties/ObservableProperty;

    .line 102
    .line 103
    invoke-static {p0, v1, v0, v2, v0}, Landroidx/constraintlayout/compose/BaseKeyFrameScope;->addOnPropertyChange$default(Landroidx/constraintlayout/compose/BaseKeyFrameScope;Ljava/lang/Object;Ljava/lang/String;ILjava/lang/Object;)Lkotlin/properties/ObservableProperty;

    .line 104
    .line 105
    .line 106
    move-result-object v3

    .line 107
    iput-object v3, p0, Landroidx/constraintlayout/compose/KeyCycleScope;->offset$delegate:Lkotlin/properties/ObservableProperty;

    .line 108
    .line 109
    invoke-static {p0, v1, v0, v2, v0}, Landroidx/constraintlayout/compose/BaseKeyFrameScope;->addOnPropertyChange$default(Landroidx/constraintlayout/compose/BaseKeyFrameScope;Ljava/lang/Object;Ljava/lang/String;ILjava/lang/Object;)Lkotlin/properties/ObservableProperty;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    iput-object v0, p0, Landroidx/constraintlayout/compose/KeyCycleScope;->phase$delegate:Lkotlin/properties/ObservableProperty;

    .line 114
    .line 115
    return-void
.end method


# virtual methods
.method public final getAlpha()F
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/compose/KeyCycleScope;->alpha$delegate:Lkotlin/properties/ObservableProperty;

    .line 2
    .line 3
    sget-object v1, Landroidx/constraintlayout/compose/KeyCycleScope;->$$delegatedProperties:[Lkotlin/reflect/KProperty;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    aget-object v1, v1, v2

    .line 7
    .line 8
    invoke-virtual {v0, p0, v1}, Lkotlin/properties/ObservableProperty;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Ljava/lang/Number;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    return v0
.end method

.method public final getOffset()F
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/compose/KeyCycleScope;->offset$delegate:Lkotlin/properties/ObservableProperty;

    .line 2
    .line 3
    sget-object v1, Landroidx/constraintlayout/compose/KeyCycleScope;->$$delegatedProperties:[Lkotlin/reflect/KProperty;

    .line 4
    .line 5
    const/16 v2, 0xa

    .line 6
    .line 7
    aget-object v1, v1, v2

    .line 8
    .line 9
    invoke-virtual {v0, p0, v1}, Lkotlin/properties/ObservableProperty;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Ljava/lang/Number;

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    return v0
.end method

.method public final getPeriod()F
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/compose/KeyCycleScope;->period$delegate:Lkotlin/properties/ObservableProperty;

    .line 2
    .line 3
    sget-object v1, Landroidx/constraintlayout/compose/KeyCycleScope;->$$delegatedProperties:[Lkotlin/reflect/KProperty;

    .line 4
    .line 5
    const/16 v2, 0x9

    .line 6
    .line 7
    aget-object v1, v1, v2

    .line 8
    .line 9
    invoke-virtual {v0, p0, v1}, Lkotlin/properties/ObservableProperty;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Ljava/lang/Number;

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    return v0
.end method

.method public final getPhase()F
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/compose/KeyCycleScope;->phase$delegate:Lkotlin/properties/ObservableProperty;

    .line 2
    .line 3
    sget-object v1, Landroidx/constraintlayout/compose/KeyCycleScope;->$$delegatedProperties:[Lkotlin/reflect/KProperty;

    .line 4
    .line 5
    const/16 v2, 0xb

    .line 6
    .line 7
    aget-object v1, v1, v2

    .line 8
    .line 9
    invoke-virtual {v0, p0, v1}, Lkotlin/properties/ObservableProperty;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Ljava/lang/Number;

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    return v0
.end method

.method public final getRotationX()F
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/compose/KeyCycleScope;->rotationX$delegate:Lkotlin/properties/ObservableProperty;

    .line 2
    .line 3
    sget-object v1, Landroidx/constraintlayout/compose/KeyCycleScope;->$$delegatedProperties:[Lkotlin/reflect/KProperty;

    .line 4
    .line 5
    const/4 v2, 0x3

    .line 6
    aget-object v1, v1, v2

    .line 7
    .line 8
    invoke-virtual {v0, p0, v1}, Lkotlin/properties/ObservableProperty;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Ljava/lang/Number;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    return v0
.end method

.method public final getRotationY()F
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/compose/KeyCycleScope;->rotationY$delegate:Lkotlin/properties/ObservableProperty;

    .line 2
    .line 3
    sget-object v1, Landroidx/constraintlayout/compose/KeyCycleScope;->$$delegatedProperties:[Lkotlin/reflect/KProperty;

    .line 4
    .line 5
    const/4 v2, 0x4

    .line 6
    aget-object v1, v1, v2

    .line 7
    .line 8
    invoke-virtual {v0, p0, v1}, Lkotlin/properties/ObservableProperty;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Ljava/lang/Number;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    return v0
.end method

.method public final getRotationZ()F
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/compose/KeyCycleScope;->rotationZ$delegate:Lkotlin/properties/ObservableProperty;

    .line 2
    .line 3
    sget-object v1, Landroidx/constraintlayout/compose/KeyCycleScope;->$$delegatedProperties:[Lkotlin/reflect/KProperty;

    .line 4
    .line 5
    const/4 v2, 0x5

    .line 6
    aget-object v1, v1, v2

    .line 7
    .line 8
    invoke-virtual {v0, p0, v1}, Lkotlin/properties/ObservableProperty;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Ljava/lang/Number;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    return v0
.end method

.method public final getScaleX()F
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/compose/KeyCycleScope;->scaleX$delegate:Lkotlin/properties/ObservableProperty;

    .line 2
    .line 3
    sget-object v1, Landroidx/constraintlayout/compose/KeyCycleScope;->$$delegatedProperties:[Lkotlin/reflect/KProperty;

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    aget-object v1, v1, v2

    .line 7
    .line 8
    invoke-virtual {v0, p0, v1}, Lkotlin/properties/ObservableProperty;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Ljava/lang/Number;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    return v0
.end method

.method public final getScaleY()F
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/compose/KeyCycleScope;->scaleY$delegate:Lkotlin/properties/ObservableProperty;

    .line 2
    .line 3
    sget-object v1, Landroidx/constraintlayout/compose/KeyCycleScope;->$$delegatedProperties:[Lkotlin/reflect/KProperty;

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    aget-object v1, v1, v2

    .line 7
    .line 8
    invoke-virtual {v0, p0, v1}, Lkotlin/properties/ObservableProperty;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Ljava/lang/Number;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    return v0
.end method

.method public final getTranslationX-D9Ej5fM()F
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/compose/KeyCycleScope;->translationX$delegate:Lkotlin/properties/ObservableProperty;

    .line 2
    .line 3
    sget-object v1, Landroidx/constraintlayout/compose/KeyCycleScope;->$$delegatedProperties:[Lkotlin/reflect/KProperty;

    .line 4
    .line 5
    const/4 v2, 0x6

    .line 6
    aget-object v1, v1, v2

    .line 7
    .line 8
    invoke-virtual {v0, p0, v1}, Lkotlin/properties/ObservableProperty;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Landroidx/compose/ui/unit/Dp;

    .line 13
    .line 14
    invoke-virtual {v0}, Landroidx/compose/ui/unit/Dp;->unbox-impl()F

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    return v0
.end method

.method public final getTranslationY-D9Ej5fM()F
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/compose/KeyCycleScope;->translationY$delegate:Lkotlin/properties/ObservableProperty;

    .line 2
    .line 3
    sget-object v1, Landroidx/constraintlayout/compose/KeyCycleScope;->$$delegatedProperties:[Lkotlin/reflect/KProperty;

    .line 4
    .line 5
    const/4 v2, 0x7

    .line 6
    aget-object v1, v1, v2

    .line 7
    .line 8
    invoke-virtual {v0, p0, v1}, Lkotlin/properties/ObservableProperty;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Landroidx/compose/ui/unit/Dp;

    .line 13
    .line 14
    invoke-virtual {v0}, Landroidx/compose/ui/unit/Dp;->unbox-impl()F

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    return v0
.end method

.method public final getTranslationZ-D9Ej5fM()F
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/compose/KeyCycleScope;->translationZ$delegate:Lkotlin/properties/ObservableProperty;

    .line 2
    .line 3
    sget-object v1, Landroidx/constraintlayout/compose/KeyCycleScope;->$$delegatedProperties:[Lkotlin/reflect/KProperty;

    .line 4
    .line 5
    const/16 v2, 0x8

    .line 6
    .line 7
    aget-object v1, v1, v2

    .line 8
    .line 9
    invoke-virtual {v0, p0, v1}, Lkotlin/properties/ObservableProperty;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Landroidx/compose/ui/unit/Dp;

    .line 14
    .line 15
    invoke-virtual {v0}, Landroidx/compose/ui/unit/Dp;->unbox-impl()F

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    return v0
.end method

.method public final setAlpha(F)V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/compose/KeyCycleScope;->alpha$delegate:Lkotlin/properties/ObservableProperty;

    .line 2
    .line 3
    sget-object v1, Landroidx/constraintlayout/compose/KeyCycleScope;->$$delegatedProperties:[Lkotlin/reflect/KProperty;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    aget-object v1, v1, v2

    .line 7
    .line 8
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-virtual {v0, p0, v1, p1}, Lkotlin/properties/ObservableProperty;->setValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final setOffset(F)V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/compose/KeyCycleScope;->offset$delegate:Lkotlin/properties/ObservableProperty;

    .line 2
    .line 3
    sget-object v1, Landroidx/constraintlayout/compose/KeyCycleScope;->$$delegatedProperties:[Lkotlin/reflect/KProperty;

    .line 4
    .line 5
    const/16 v2, 0xa

    .line 6
    .line 7
    aget-object v1, v1, v2

    .line 8
    .line 9
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-virtual {v0, p0, v1, p1}, Lkotlin/properties/ObservableProperty;->setValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final setPeriod(F)V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/compose/KeyCycleScope;->period$delegate:Lkotlin/properties/ObservableProperty;

    .line 2
    .line 3
    sget-object v1, Landroidx/constraintlayout/compose/KeyCycleScope;->$$delegatedProperties:[Lkotlin/reflect/KProperty;

    .line 4
    .line 5
    const/16 v2, 0x9

    .line 6
    .line 7
    aget-object v1, v1, v2

    .line 8
    .line 9
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-virtual {v0, p0, v1, p1}, Lkotlin/properties/ObservableProperty;->setValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final setPhase(F)V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/compose/KeyCycleScope;->phase$delegate:Lkotlin/properties/ObservableProperty;

    .line 2
    .line 3
    sget-object v1, Landroidx/constraintlayout/compose/KeyCycleScope;->$$delegatedProperties:[Lkotlin/reflect/KProperty;

    .line 4
    .line 5
    const/16 v2, 0xb

    .line 6
    .line 7
    aget-object v1, v1, v2

    .line 8
    .line 9
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-virtual {v0, p0, v1, p1}, Lkotlin/properties/ObservableProperty;->setValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final setRotationX(F)V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/compose/KeyCycleScope;->rotationX$delegate:Lkotlin/properties/ObservableProperty;

    .line 2
    .line 3
    sget-object v1, Landroidx/constraintlayout/compose/KeyCycleScope;->$$delegatedProperties:[Lkotlin/reflect/KProperty;

    .line 4
    .line 5
    const/4 v2, 0x3

    .line 6
    aget-object v1, v1, v2

    .line 7
    .line 8
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-virtual {v0, p0, v1, p1}, Lkotlin/properties/ObservableProperty;->setValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final setRotationY(F)V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/compose/KeyCycleScope;->rotationY$delegate:Lkotlin/properties/ObservableProperty;

    .line 2
    .line 3
    sget-object v1, Landroidx/constraintlayout/compose/KeyCycleScope;->$$delegatedProperties:[Lkotlin/reflect/KProperty;

    .line 4
    .line 5
    const/4 v2, 0x4

    .line 6
    aget-object v1, v1, v2

    .line 7
    .line 8
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-virtual {v0, p0, v1, p1}, Lkotlin/properties/ObservableProperty;->setValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final setRotationZ(F)V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/compose/KeyCycleScope;->rotationZ$delegate:Lkotlin/properties/ObservableProperty;

    .line 2
    .line 3
    sget-object v1, Landroidx/constraintlayout/compose/KeyCycleScope;->$$delegatedProperties:[Lkotlin/reflect/KProperty;

    .line 4
    .line 5
    const/4 v2, 0x5

    .line 6
    aget-object v1, v1, v2

    .line 7
    .line 8
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-virtual {v0, p0, v1, p1}, Lkotlin/properties/ObservableProperty;->setValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final setScaleX(F)V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/compose/KeyCycleScope;->scaleX$delegate:Lkotlin/properties/ObservableProperty;

    .line 2
    .line 3
    sget-object v1, Landroidx/constraintlayout/compose/KeyCycleScope;->$$delegatedProperties:[Lkotlin/reflect/KProperty;

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    aget-object v1, v1, v2

    .line 7
    .line 8
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-virtual {v0, p0, v1, p1}, Lkotlin/properties/ObservableProperty;->setValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final setScaleY(F)V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/compose/KeyCycleScope;->scaleY$delegate:Lkotlin/properties/ObservableProperty;

    .line 2
    .line 3
    sget-object v1, Landroidx/constraintlayout/compose/KeyCycleScope;->$$delegatedProperties:[Lkotlin/reflect/KProperty;

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    aget-object v1, v1, v2

    .line 7
    .line 8
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-virtual {v0, p0, v1, p1}, Lkotlin/properties/ObservableProperty;->setValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final setTranslationX-0680j_4(F)V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/compose/KeyCycleScope;->translationX$delegate:Lkotlin/properties/ObservableProperty;

    .line 2
    .line 3
    sget-object v1, Landroidx/constraintlayout/compose/KeyCycleScope;->$$delegatedProperties:[Lkotlin/reflect/KProperty;

    .line 4
    .line 5
    const/4 v2, 0x6

    .line 6
    aget-object v1, v1, v2

    .line 7
    .line 8
    invoke-static {p1}, Landroidx/compose/ui/unit/Dp;->box-impl(F)Landroidx/compose/ui/unit/Dp;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-virtual {v0, p0, v1, p1}, Lkotlin/properties/ObservableProperty;->setValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final setTranslationY-0680j_4(F)V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/compose/KeyCycleScope;->translationY$delegate:Lkotlin/properties/ObservableProperty;

    .line 2
    .line 3
    sget-object v1, Landroidx/constraintlayout/compose/KeyCycleScope;->$$delegatedProperties:[Lkotlin/reflect/KProperty;

    .line 4
    .line 5
    const/4 v2, 0x7

    .line 6
    aget-object v1, v1, v2

    .line 7
    .line 8
    invoke-static {p1}, Landroidx/compose/ui/unit/Dp;->box-impl(F)Landroidx/compose/ui/unit/Dp;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-virtual {v0, p0, v1, p1}, Lkotlin/properties/ObservableProperty;->setValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final setTranslationZ-0680j_4(F)V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/compose/KeyCycleScope;->translationZ$delegate:Lkotlin/properties/ObservableProperty;

    .line 2
    .line 3
    sget-object v1, Landroidx/constraintlayout/compose/KeyCycleScope;->$$delegatedProperties:[Lkotlin/reflect/KProperty;

    .line 4
    .line 5
    const/16 v2, 0x8

    .line 6
    .line 7
    aget-object v1, v1, v2

    .line 8
    .line 9
    invoke-static {p1}, Landroidx/compose/ui/unit/Dp;->box-impl(F)Landroidx/compose/ui/unit/Dp;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-virtual {v0, p0, v1, p1}, Lkotlin/properties/ObservableProperty;->setValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method
