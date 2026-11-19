.class public final synthetic Lt6/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:Lt6/o0;

.field public final synthetic b:Lkotlin/jvm/functions/Function0;

.field public final synthetic c:Lkotlin/jvm/functions/Function0;

.field public final synthetic d:Lkotlin/jvm/functions/Function0;

.field public final synthetic e:Lkotlin/jvm/functions/Function0;

.field public final synthetic f:Lkotlin/jvm/functions/Function0;

.field public final synthetic g:Lkotlin/jvm/functions/Function0;

.field public final synthetic h:Lkotlin/jvm/functions/Function0;

.field public final synthetic i:I

.field public final synthetic j:I


# direct methods
.method public synthetic constructor <init>(Lt6/o0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt6/w;->a:Lt6/o0;

    iput-object p2, p0, Lt6/w;->b:Lkotlin/jvm/functions/Function0;

    iput-object p3, p0, Lt6/w;->c:Lkotlin/jvm/functions/Function0;

    iput-object p4, p0, Lt6/w;->d:Lkotlin/jvm/functions/Function0;

    iput-object p5, p0, Lt6/w;->e:Lkotlin/jvm/functions/Function0;

    iput-object p6, p0, Lt6/w;->f:Lkotlin/jvm/functions/Function0;

    iput-object p7, p0, Lt6/w;->g:Lkotlin/jvm/functions/Function0;

    iput-object p8, p0, Lt6/w;->h:Lkotlin/jvm/functions/Function0;

    iput p9, p0, Lt6/w;->i:I

    iput p10, p0, Lt6/w;->j:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget-object v0, p0, Lt6/w;->a:Lt6/o0;

    iget-object v1, p0, Lt6/w;->b:Lkotlin/jvm/functions/Function0;

    iget-object v2, p0, Lt6/w;->c:Lkotlin/jvm/functions/Function0;

    iget-object v3, p0, Lt6/w;->d:Lkotlin/jvm/functions/Function0;

    iget-object v4, p0, Lt6/w;->e:Lkotlin/jvm/functions/Function0;

    iget-object v5, p0, Lt6/w;->f:Lkotlin/jvm/functions/Function0;

    iget-object v6, p0, Lt6/w;->g:Lkotlin/jvm/functions/Function0;

    iget-object v7, p0, Lt6/w;->h:Lkotlin/jvm/functions/Function0;

    iget v8, p0, Lt6/w;->i:I

    iget v9, p0, Lt6/w;->j:I

    move-object v10, p1

    check-cast v10, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v11

    invoke-static/range {v0 .. v11}, Lt6/z;->k(Lt6/o0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
