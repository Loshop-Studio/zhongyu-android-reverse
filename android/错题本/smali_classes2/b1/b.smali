.class public final Lb1/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/TypeEvaluator;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lb1/b;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final evaluate(FLjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Lb1/b;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p2, Lb1/d;

    .line 7
    .line 8
    check-cast p3, Lb1/d;

    .line 9
    .line 10
    iget v0, p2, Lb1/d;->a:F

    .line 11
    .line 12
    iget v1, p3, Lb1/d;->a:F

    .line 13
    .line 14
    invoke-static {v1, v0, p1, v0}, Landroid/support/v4/media/f;->b(FFFF)F

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    iget p2, p2, Lb1/d;->b:F

    .line 19
    .line 20
    iget p3, p3, Lb1/d;->b:F

    .line 21
    .line 22
    invoke-static {p3, p2, p1, p2}, Landroid/support/v4/media/f;->b(FFFF)F

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    new-instance p2, Lb1/d;

    .line 27
    .line 28
    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    .line 29
    .line 30
    .line 31
    iput v0, p2, Lb1/d;->a:F

    .line 32
    .line 33
    iput p1, p2, Lb1/d;->b:F

    .line 34
    .line 35
    return-object p2

    .line 36
    :pswitch_0
    check-cast p2, Lb1/a;

    .line 37
    .line 38
    check-cast p3, Lb1/a;

    .line 39
    .line 40
    iget v0, p2, Lb1/a;->a:F

    .line 41
    .line 42
    iget v1, p3, Lb1/a;->a:F

    .line 43
    .line 44
    invoke-static {v1, v0, p1, v0}, Landroid/support/v4/media/f;->b(FFFF)F

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    iget p2, p2, Lb1/a;->b:F

    .line 49
    .line 50
    iget p3, p3, Lb1/a;->b:F

    .line 51
    .line 52
    invoke-static {p3, p2, p1, p2}, Landroid/support/v4/media/f;->b(FFFF)F

    .line 53
    .line 54
    .line 55
    move-result p1

    .line 56
    new-instance p2, Lb1/a;

    .line 57
    .line 58
    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    .line 59
    .line 60
    .line 61
    iput v0, p2, Lb1/a;->a:F

    .line 62
    .line 63
    iput p1, p2, Lb1/a;->b:F

    .line 64
    .line 65
    return-object p2

    .line 66
    nop

    .line 67
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
