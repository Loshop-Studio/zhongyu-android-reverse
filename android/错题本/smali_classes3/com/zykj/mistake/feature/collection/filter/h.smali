.class public final synthetic Lcom/zykj/mistake/feature/collection/filter/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr6/e;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:J

.field public final synthetic d:J

.field public final synthetic e:Lr6/a;

.field public final synthetic f:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;JJLr6/a;II)V
    .locals 0

    .line 1
    iput p8, p0, Lcom/zykj/mistake/feature/collection/filter/h;->a:I

    iput-object p1, p0, Lcom/zykj/mistake/feature/collection/filter/h;->b:Ljava/lang/String;

    iput-wide p2, p0, Lcom/zykj/mistake/feature/collection/filter/h;->c:J

    iput-wide p4, p0, Lcom/zykj/mistake/feature/collection/filter/h;->d:J

    iput-object p6, p0, Lcom/zykj/mistake/feature/collection/filter/h;->e:Lr6/a;

    iput p7, p0, Lcom/zykj/mistake/feature/collection/filter/h;->f:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget v0, p0, Lcom/zykj/mistake/feature/collection/filter/h;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    move-object v7, p1

    .line 7
    check-cast v7, Landroidx/compose/runtime/Composer;

    .line 8
    .line 9
    check-cast p2, Ljava/lang/Integer;

    .line 10
    .line 11
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 12
    .line 13
    .line 14
    iget p1, p0, Lcom/zykj/mistake/feature/collection/filter/h;->f:I

    .line 15
    .line 16
    or-int/lit8 p1, p1, 0x1

    .line 17
    .line 18
    invoke-static {p1}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    .line 19
    .line 20
    .line 21
    move-result v8

    .line 22
    iget-object v1, p0, Lcom/zykj/mistake/feature/collection/filter/h;->b:Ljava/lang/String;

    .line 23
    .line 24
    iget-wide v2, p0, Lcom/zykj/mistake/feature/collection/filter/h;->c:J

    .line 25
    .line 26
    iget-wide v4, p0, Lcom/zykj/mistake/feature/collection/filter/h;->d:J

    .line 27
    .line 28
    iget-object v6, p0, Lcom/zykj/mistake/feature/collection/filter/h;->e:Lr6/a;

    .line 29
    .line 30
    invoke-static/range {v1 .. v8}, Lcom/zykj/mistake/main/drawer/l;->a(Ljava/lang/String;JJLr6/a;Landroidx/compose/runtime/Composer;I)V

    .line 31
    .line 32
    .line 33
    :goto_0
    sget-object p1, Ld6/s;->a:Ld6/s;

    .line 34
    .line 35
    return-object p1

    .line 36
    :pswitch_0
    move-object v6, p1

    .line 37
    check-cast v6, Landroidx/compose/runtime/Composer;

    .line 38
    .line 39
    check-cast p2, Ljava/lang/Integer;

    .line 40
    .line 41
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 42
    .line 43
    .line 44
    iget p1, p0, Lcom/zykj/mistake/feature/collection/filter/h;->f:I

    .line 45
    .line 46
    or-int/lit8 p1, p1, 0x1

    .line 47
    .line 48
    invoke-static {p1}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    .line 49
    .line 50
    .line 51
    move-result v7

    .line 52
    iget-object v0, p0, Lcom/zykj/mistake/feature/collection/filter/h;->b:Ljava/lang/String;

    .line 53
    .line 54
    iget-wide v1, p0, Lcom/zykj/mistake/feature/collection/filter/h;->c:J

    .line 55
    .line 56
    iget-wide v3, p0, Lcom/zykj/mistake/feature/collection/filter/h;->d:J

    .line 57
    .line 58
    iget-object v5, p0, Lcom/zykj/mistake/feature/collection/filter/h;->e:Lr6/a;

    .line 59
    .line 60
    invoke-static/range {v0 .. v7}, Lcom/zykj/mistake/main/drawer/g;->b(Ljava/lang/String;JJLr6/a;Landroidx/compose/runtime/Composer;I)V

    .line 61
    .line 62
    .line 63
    goto :goto_0

    .line 64
    :pswitch_1
    move-object v6, p1

    .line 65
    check-cast v6, Landroidx/compose/runtime/Composer;

    .line 66
    .line 67
    check-cast p2, Ljava/lang/Integer;

    .line 68
    .line 69
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 70
    .line 71
    .line 72
    iget p1, p0, Lcom/zykj/mistake/feature/collection/filter/h;->f:I

    .line 73
    .line 74
    or-int/lit8 p1, p1, 0x1

    .line 75
    .line 76
    invoke-static {p1}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    .line 77
    .line 78
    .line 79
    move-result v7

    .line 80
    iget-object v0, p0, Lcom/zykj/mistake/feature/collection/filter/h;->b:Ljava/lang/String;

    .line 81
    .line 82
    iget-wide v1, p0, Lcom/zykj/mistake/feature/collection/filter/h;->c:J

    .line 83
    .line 84
    iget-wide v3, p0, Lcom/zykj/mistake/feature/collection/filter/h;->d:J

    .line 85
    .line 86
    iget-object v5, p0, Lcom/zykj/mistake/feature/collection/filter/h;->e:Lr6/a;

    .line 87
    .line 88
    invoke-static/range {v0 .. v7}, Lcom/zykj/mistake/feature/collection/filter/i;->a(Ljava/lang/String;JJLr6/a;Landroidx/compose/runtime/Composer;I)V

    .line 89
    .line 90
    .line 91
    goto :goto_0

    .line 92
    nop

    .line 93
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
