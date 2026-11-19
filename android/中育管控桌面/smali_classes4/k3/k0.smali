.class public final synthetic Lk3/k0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:J

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Lkotlin/jvm/functions/Function0;

.field public final synthetic d:I

.field public final synthetic e:I


# direct methods
.method public synthetic constructor <init>(JLjava/lang/String;Lkotlin/jvm/functions/Function0;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lk3/k0;->a:J

    iput-object p3, p0, Lk3/k0;->b:Ljava/lang/String;

    iput-object p4, p0, Lk3/k0;->c:Lkotlin/jvm/functions/Function0;

    iput p5, p0, Lk3/k0;->d:I

    iput p6, p0, Lk3/k0;->e:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-wide v0, p0, Lk3/k0;->a:J

    iget-object v2, p0, Lk3/k0;->b:Ljava/lang/String;

    iget-object v3, p0, Lk3/k0;->c:Lkotlin/jvm/functions/Function0;

    iget v4, p0, Lk3/k0;->d:I

    iget v5, p0, Lk3/k0;->e:I

    move-object v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    invoke-static/range {v0 .. v7}, Lk3/m0;->f(JLjava/lang/String;Lkotlin/jvm/functions/Function0;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
