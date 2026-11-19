.class public final Lk7/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Iterable;
.implements Ls6/a;


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, Lk7/i;->a:I

    iput-object p1, p0, Lk7/i;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final iterator()Ljava/util/Iterator;
    .locals 2

    .line 1
    iget v0, p0, Lk7/i;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lk7/i;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lkotlin/text/c;

    .line 9
    .line 10
    new-instance v1, Lkotlin/text/b;

    .line 11
    .line 12
    invoke-direct {v1, v0}, Lkotlin/text/b;-><init>(Lkotlin/text/c;)V

    .line 13
    .line 14
    .line 15
    return-object v1

    .line 16
    :pswitch_0
    new-instance v0, Lkotlin/collections/b0;

    .line 17
    .line 18
    iget-object v1, p0, Lk7/i;->b:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v1, Landroidx/navigation/b;

    .line 21
    .line 22
    iget-object v1, v1, Landroidx/navigation/b;->b:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v1, [Ljava/lang/Object;

    .line 25
    .line 26
    invoke-static {v1}, Lkotlin/jvm/internal/k;->l([Ljava/lang/Object;)Ld6/j;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-direct {v0, v1}, Lkotlin/collections/b0;-><init>(Ljava/util/Iterator;)V

    .line 31
    .line 32
    .line 33
    return-object v0

    .line 34
    :pswitch_1
    iget-object v0, p0, Lk7/i;->b:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v0, [D

    .line 37
    .line 38
    const-string v1, "array"

    .line 39
    .line 40
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    new-instance v1, Ld6/j;

    .line 44
    .line 45
    invoke-direct {v1, v0}, Ld6/j;-><init>([D)V

    .line 46
    .line 47
    .line 48
    return-object v1

    .line 49
    :pswitch_2
    iget-object v0, p0, Lk7/i;->b:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v0, [F

    .line 52
    .line 53
    const-string v1, "array"

    .line 54
    .line 55
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    new-instance v1, Ld6/j;

    .line 59
    .line 60
    invoke-direct {v1, v0}, Ld6/j;-><init>([F)V

    .line 61
    .line 62
    .line 63
    return-object v1

    .line 64
    :pswitch_3
    iget-object v0, p0, Lk7/i;->b:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast v0, [J

    .line 67
    .line 68
    const-string v1, "array"

    .line 69
    .line 70
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    new-instance v1, Lkotlin/jvm/internal/b;

    .line 74
    .line 75
    invoke-direct {v1, v0}, Lkotlin/jvm/internal/b;-><init>([J)V

    .line 76
    .line 77
    .line 78
    return-object v1

    .line 79
    :pswitch_4
    iget-object v0, p0, Lk7/i;->b:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast v0, [I

    .line 82
    .line 83
    const-string v1, "array"

    .line 84
    .line 85
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    new-instance v1, Lkotlin/jvm/internal/a;

    .line 89
    .line 90
    invoke-direct {v1, v0}, Lkotlin/jvm/internal/a;-><init>([I)V

    .line 91
    .line 92
    .line 93
    return-object v1

    .line 94
    :pswitch_5
    iget-object v0, p0, Lk7/i;->b:Ljava/lang/Object;

    .line 95
    .line 96
    check-cast v0, [Ljava/lang/Object;

    .line 97
    .line 98
    invoke-static {v0}, Lkotlin/jvm/internal/k;->l([Ljava/lang/Object;)Ld6/j;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    return-object v0

    .line 103
    :pswitch_6
    new-instance v0, Ld6/j;

    .line 104
    .line 105
    iget-object v1, p0, Lk7/i;->b:Ljava/lang/Object;

    .line 106
    .line 107
    check-cast v1, Lm7/x;

    .line 108
    .line 109
    invoke-direct {v0, v1}, Ld6/j;-><init>(Lm7/x;)V

    .line 110
    .line 111
    .line 112
    return-object v0

    .line 113
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
