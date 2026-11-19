.class public final synthetic Lg6/y0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:Z

.field public final synthetic b:Ljava/util/List;

.field public final synthetic c:Lkotlin/jvm/functions/Function3;

.field public final synthetic d:Lkotlin/jvm/functions/Function2;

.field public final synthetic e:Lkotlin/jvm/functions/Function2;

.field public final synthetic f:I

.field public final synthetic g:I


# direct methods
.method public synthetic constructor <init>(ZLjava/util/List;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lg6/y0;->a:Z

    iput-object p2, p0, Lg6/y0;->b:Ljava/util/List;

    iput-object p3, p0, Lg6/y0;->c:Lkotlin/jvm/functions/Function3;

    iput-object p4, p0, Lg6/y0;->d:Lkotlin/jvm/functions/Function2;

    iput-object p5, p0, Lg6/y0;->e:Lkotlin/jvm/functions/Function2;

    iput p6, p0, Lg6/y0;->f:I

    iput p7, p0, Lg6/y0;->g:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget-boolean v0, p0, Lg6/y0;->a:Z

    iget-object v1, p0, Lg6/y0;->b:Ljava/util/List;

    iget-object v2, p0, Lg6/y0;->c:Lkotlin/jvm/functions/Function3;

    iget-object v3, p0, Lg6/y0;->d:Lkotlin/jvm/functions/Function2;

    iget-object v4, p0, Lg6/y0;->e:Lkotlin/jvm/functions/Function2;

    iget v5, p0, Lg6/y0;->f:I

    iget v6, p0, Lg6/y0;->g:I

    move-object v7, p1

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v8

    invoke-static/range {v0 .. v8}, Lg6/z0;->a(ZLjava/util/List;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
