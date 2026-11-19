.class public final synthetic Le7/z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:Landroidx/compose/ui/Modifier;

.field public final synthetic b:Ljava/util/List;

.field public final synthetic c:J

.field public final synthetic d:Lkotlin/jvm/functions/Function1;

.field public final synthetic e:I

.field public final synthetic f:I


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;Ljava/util/List;JLkotlin/jvm/functions/Function1;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le7/z;->a:Landroidx/compose/ui/Modifier;

    iput-object p2, p0, Le7/z;->b:Ljava/util/List;

    iput-wide p3, p0, Le7/z;->c:J

    iput-object p5, p0, Le7/z;->d:Lkotlin/jvm/functions/Function1;

    iput p6, p0, Le7/z;->e:I

    iput p7, p0, Le7/z;->f:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget-object v0, p0, Le7/z;->a:Landroidx/compose/ui/Modifier;

    iget-object v1, p0, Le7/z;->b:Ljava/util/List;

    iget-wide v2, p0, Le7/z;->c:J

    iget-object v4, p0, Le7/z;->d:Lkotlin/jvm/functions/Function1;

    iget v5, p0, Le7/z;->e:I

    iget v6, p0, Le7/z;->f:I

    move-object v7, p1

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v8

    invoke-static/range {v0 .. v8}, Le7/b0;->c(Landroidx/compose/ui/Modifier;Ljava/util/List;JLkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
