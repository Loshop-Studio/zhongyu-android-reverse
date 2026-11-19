.class public abstract Li7/g;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Landroid/support/v4/media/h;

.field public static final b:Landroid/support/v4/media/h;

.field public static final c:Landroid/support/v4/media/h;

.field public static final d:Landroid/support/v4/media/h;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lcom/zykj/mistake/feature/notebook/list/k1;

    .line 2
    .line 3
    const/16 v1, 0x18

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lcom/zykj/mistake/feature/notebook/list/k1;-><init>(I)V

    .line 6
    .line 7
    .line 8
    sget-boolean v1, Lm7/m;->a:Z

    .line 9
    .line 10
    new-instance v2, Landroid/support/v4/media/h;

    .line 11
    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    const/16 v3, 0xf

    .line 15
    .line 16
    invoke-direct {v2, v0, v3}, Landroid/support/v4/media/h;-><init>(Lr6/c;I)V

    .line 17
    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/16 v3, 0x11

    .line 21
    .line 22
    invoke-direct {v2, v0, v3}, Landroid/support/v4/media/h;-><init>(Lr6/c;I)V

    .line 23
    .line 24
    .line 25
    :goto_0
    sput-object v2, Li7/g;->a:Landroid/support/v4/media/h;

    .line 26
    .line 27
    new-instance v0, Lcom/zykj/mistake/feature/notebook/list/k1;

    .line 28
    .line 29
    const/16 v2, 0x19

    .line 30
    .line 31
    invoke-direct {v0, v2}, Lcom/zykj/mistake/feature/notebook/list/k1;-><init>(I)V

    .line 32
    .line 33
    .line 34
    new-instance v2, Landroid/support/v4/media/h;

    .line 35
    .line 36
    if-eqz v1, :cond_1

    .line 37
    .line 38
    const/16 v3, 0xf

    .line 39
    .line 40
    invoke-direct {v2, v0, v3}, Landroid/support/v4/media/h;-><init>(Lr6/c;I)V

    .line 41
    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_1
    const/16 v3, 0x11

    .line 45
    .line 46
    invoke-direct {v2, v0, v3}, Landroid/support/v4/media/h;-><init>(Lr6/c;I)V

    .line 47
    .line 48
    .line 49
    :goto_1
    sput-object v2, Li7/g;->b:Landroid/support/v4/media/h;

    .line 50
    .line 51
    new-instance v0, Le7/t;

    .line 52
    .line 53
    const/4 v2, 0x5

    .line 54
    invoke-direct {v0, v2}, Le7/t;-><init>(I)V

    .line 55
    .line 56
    .line 57
    new-instance v2, Landroid/support/v4/media/h;

    .line 58
    .line 59
    if-eqz v1, :cond_2

    .line 60
    .line 61
    const/16 v3, 0x10

    .line 62
    .line 63
    invoke-direct {v2, v0, v3}, Landroid/support/v4/media/h;-><init>(Lr6/e;I)V

    .line 64
    .line 65
    .line 66
    goto :goto_2

    .line 67
    :cond_2
    const/16 v3, 0x12

    .line 68
    .line 69
    invoke-direct {v2, v0, v3}, Landroid/support/v4/media/h;-><init>(Lr6/e;I)V

    .line 70
    .line 71
    .line 72
    :goto_2
    sput-object v2, Li7/g;->c:Landroid/support/v4/media/h;

    .line 73
    .line 74
    new-instance v0, Le7/t;

    .line 75
    .line 76
    const/4 v2, 0x6

    .line 77
    invoke-direct {v0, v2}, Le7/t;-><init>(I)V

    .line 78
    .line 79
    .line 80
    if-eqz v1, :cond_3

    .line 81
    .line 82
    new-instance v1, Landroid/support/v4/media/h;

    .line 83
    .line 84
    const/16 v2, 0x10

    .line 85
    .line 86
    invoke-direct {v1, v0, v2}, Landroid/support/v4/media/h;-><init>(Lr6/e;I)V

    .line 87
    .line 88
    .line 89
    goto :goto_3

    .line 90
    :cond_3
    new-instance v1, Landroid/support/v4/media/h;

    .line 91
    .line 92
    const/16 v2, 0x12

    .line 93
    .line 94
    invoke-direct {v1, v0, v2}, Landroid/support/v4/media/h;-><init>(Lr6/e;I)V

    .line 95
    .line 96
    .line 97
    :goto_3
    sput-object v1, Li7/g;->d:Landroid/support/v4/media/h;

    .line 98
    .line 99
    return-void
.end method
