.class public final synthetic Lk3/h0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:Lk3/s0;

.field public final synthetic b:Lkotlin/jvm/functions/Function0;

.field public final synthetic c:Lkotlin/jvm/functions/Function0;

.field public final synthetic d:Lkotlin/jvm/functions/Function0;

.field public final synthetic e:I


# direct methods
.method public synthetic constructor <init>(Lk3/s0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk3/h0;->a:Lk3/s0;

    iput-object p2, p0, Lk3/h0;->b:Lkotlin/jvm/functions/Function0;

    iput-object p3, p0, Lk3/h0;->c:Lkotlin/jvm/functions/Function0;

    iput-object p4, p0, Lk3/h0;->d:Lkotlin/jvm/functions/Function0;

    iput p5, p0, Lk3/h0;->e:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-object v0, p0, Lk3/h0;->a:Lk3/s0;

    iget-object v1, p0, Lk3/h0;->b:Lkotlin/jvm/functions/Function0;

    iget-object v2, p0, Lk3/h0;->c:Lkotlin/jvm/functions/Function0;

    iget-object v3, p0, Lk3/h0;->d:Lkotlin/jvm/functions/Function0;

    iget v4, p0, Lk3/h0;->e:I

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    invoke-static/range {v0 .. v6}, Lk3/m0;->c(Lk3/s0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
