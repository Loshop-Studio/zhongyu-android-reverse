.class public final synthetic Li3/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:J

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:I

.field public final synthetic d:Landroidx/compose/ui/text/font/FontWeight;

.field public final synthetic e:Lkotlin/jvm/functions/Function0;

.field public final synthetic f:I

.field public final synthetic g:I


# direct methods
.method public synthetic constructor <init>(JLjava/lang/String;ILandroidx/compose/ui/text/font/FontWeight;Lkotlin/jvm/functions/Function0;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Li3/f;->a:J

    iput-object p3, p0, Li3/f;->b:Ljava/lang/String;

    iput p4, p0, Li3/f;->c:I

    iput-object p5, p0, Li3/f;->d:Landroidx/compose/ui/text/font/FontWeight;

    iput-object p6, p0, Li3/f;->e:Lkotlin/jvm/functions/Function0;

    iput p7, p0, Li3/f;->f:I

    iput p8, p0, Li3/f;->g:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget-wide v0, p0, Li3/f;->a:J

    iget-object v2, p0, Li3/f;->b:Ljava/lang/String;

    iget v3, p0, Li3/f;->c:I

    iget-object v4, p0, Li3/f;->d:Landroidx/compose/ui/text/font/FontWeight;

    iget-object v5, p0, Li3/f;->e:Lkotlin/jvm/functions/Function0;

    iget v6, p0, Li3/f;->f:I

    iget v7, p0, Li3/f;->g:I

    move-object v8, p1

    check-cast v8, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v9

    invoke-static/range {v0 .. v9}, Li3/k;->g(JLjava/lang/String;ILandroidx/compose/ui/text/font/FontWeight;Lkotlin/jvm/functions/Function0;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
