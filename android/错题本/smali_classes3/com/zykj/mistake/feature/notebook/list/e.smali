.class public final Lcom/zykj/mistake/feature/notebook/list/e;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroid/graphics/Paint;

.field public final b:Landroid/graphics/Paint;

.field public final c:Landroid/graphics/Paint;

.field public final d:Landroid/graphics/Paint;

.field public final e:Landroid/graphics/Paint;

.field public final f:Landroid/graphics/Paint;


# direct methods
.method public constructor <init>(FFF)V
    .locals 6

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-wide v0, 0xff1576ffL

    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    invoke-static {v0, v1}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 10
    .line 11
    .line 12
    move-result-wide v0

    .line 13
    const/4 v2, 0x1

    .line 14
    invoke-static {v2, p1, v0, v1}, Lcom/zykj/mistake/feature/notebook/list/d;->c(ZFJ)Landroid/graphics/Paint;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iput-object v0, p0, Lcom/zykj/mistake/feature/notebook/list/e;->a:Landroid/graphics/Paint;

    .line 19
    .line 20
    const-wide v0, 0xff666666L

    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    invoke-static {v0, v1}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 26
    .line 27
    .line 28
    move-result-wide v3

    .line 29
    const/4 v5, 0x0

    .line 30
    invoke-static {v5, p1, v3, v4}, Lcom/zykj/mistake/feature/notebook/list/d;->c(ZFJ)Landroid/graphics/Paint;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    iput-object p1, p0, Lcom/zykj/mistake/feature/notebook/list/e;->b:Landroid/graphics/Paint;

    .line 35
    .line 36
    invoke-static {v0, v1}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 37
    .line 38
    .line 39
    move-result-wide v0

    .line 40
    invoke-static {v5, p2, v0, v1}, Lcom/zykj/mistake/feature/notebook/list/d;->c(ZFJ)Landroid/graphics/Paint;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    iput-object p1, p0, Lcom/zykj/mistake/feature/notebook/list/e;->c:Landroid/graphics/Paint;

    .line 45
    .line 46
    const-wide p1, 0xff27c69aL

    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    invoke-static {p1, p2}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 52
    .line 53
    .line 54
    move-result-wide p1

    .line 55
    invoke-static {v2, p3, p1, p2}, Lcom/zykj/mistake/feature/notebook/list/d;->c(ZFJ)Landroid/graphics/Paint;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    iput-object p1, p0, Lcom/zykj/mistake/feature/notebook/list/e;->d:Landroid/graphics/Paint;

    .line 60
    .line 61
    const-wide p1, 0xffff3b30L

    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    invoke-static {p1, p2}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 67
    .line 68
    .line 69
    move-result-wide p1

    .line 70
    invoke-static {v2, p3, p1, p2}, Lcom/zykj/mistake/feature/notebook/list/d;->c(ZFJ)Landroid/graphics/Paint;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    iput-object p1, p0, Lcom/zykj/mistake/feature/notebook/list/e;->e:Landroid/graphics/Paint;

    .line 75
    .line 76
    const-wide p1, 0xffb5b5b5L

    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    invoke-static {p1, p2}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 82
    .line 83
    .line 84
    move-result-wide p1

    .line 85
    invoke-static {v5, p3, p1, p2}, Lcom/zykj/mistake/feature/notebook/list/d;->c(ZFJ)Landroid/graphics/Paint;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    iput-object p1, p0, Lcom/zykj/mistake/feature/notebook/list/e;->f:Landroid/graphics/Paint;

    .line 90
    .line 91
    return-void
.end method
