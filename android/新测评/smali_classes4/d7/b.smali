.class public final synthetic Ld7/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:Z

.field public final synthetic b:Z

.field public final synthetic c:Lkotlin/jvm/functions/Function2;

.field public final synthetic d:I

.field public final synthetic e:I


# direct methods
.method public synthetic constructor <init>(ZZLkotlin/jvm/functions/Function2;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Ld7/b;->a:Z

    iput-boolean p2, p0, Ld7/b;->b:Z

    iput-object p3, p0, Ld7/b;->c:Lkotlin/jvm/functions/Function2;

    iput p4, p0, Ld7/b;->d:I

    iput p5, p0, Ld7/b;->e:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-boolean v0, p0, Ld7/b;->a:Z

    iget-boolean v1, p0, Ld7/b;->b:Z

    iget-object v2, p0, Ld7/b;->c:Lkotlin/jvm/functions/Function2;

    iget v3, p0, Ld7/b;->d:I

    iget v4, p0, Ld7/b;->e:I

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    invoke-static/range {v0 .. v6}, Ld7/c;->a(ZZLkotlin/jvm/functions/Function2;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
