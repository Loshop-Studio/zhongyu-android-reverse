.class public final synthetic Lz5/c0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:Landroidx/compose/ui/Modifier;

.field public final synthetic b:Ljava/util/List;

.field public final synthetic c:J

.field public final synthetic d:Z

.field public final synthetic e:Lkotlin/jvm/functions/Function1;

.field public final synthetic f:I

.field public final synthetic g:I


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;Ljava/util/List;JZLkotlin/jvm/functions/Function1;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz5/c0;->a:Landroidx/compose/ui/Modifier;

    iput-object p2, p0, Lz5/c0;->b:Ljava/util/List;

    iput-wide p3, p0, Lz5/c0;->c:J

    iput-boolean p5, p0, Lz5/c0;->d:Z

    iput-object p6, p0, Lz5/c0;->e:Lkotlin/jvm/functions/Function1;

    iput p7, p0, Lz5/c0;->f:I

    iput p8, p0, Lz5/c0;->g:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget-object v0, p0, Lz5/c0;->a:Landroidx/compose/ui/Modifier;

    iget-object v1, p0, Lz5/c0;->b:Ljava/util/List;

    iget-wide v2, p0, Lz5/c0;->c:J

    iget-boolean v4, p0, Lz5/c0;->d:Z

    iget-object v5, p0, Lz5/c0;->e:Lkotlin/jvm/functions/Function1;

    iget v6, p0, Lz5/c0;->f:I

    iget v7, p0, Lz5/c0;->g:I

    move-object v8, p1

    check-cast v8, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v9

    invoke-static/range {v0 .. v9}, Lz5/i0;->l(Landroidx/compose/ui/Modifier;Ljava/util/List;JZLkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
