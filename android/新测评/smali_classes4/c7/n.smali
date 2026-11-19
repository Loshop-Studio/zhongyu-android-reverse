.class public final synthetic Lc7/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:Landroidx/compose/ui/Modifier;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Lc7/c;

.field public final synthetic d:I

.field public final synthetic e:I


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;Ljava/lang/String;Lc7/c;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc7/n;->a:Landroidx/compose/ui/Modifier;

    iput-object p2, p0, Lc7/n;->b:Ljava/lang/String;

    iput-object p3, p0, Lc7/n;->c:Lc7/c;

    iput p4, p0, Lc7/n;->d:I

    iput p5, p0, Lc7/n;->e:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-object v0, p0, Lc7/n;->a:Landroidx/compose/ui/Modifier;

    iget-object v1, p0, Lc7/n;->b:Ljava/lang/String;

    iget-object v2, p0, Lc7/n;->c:Lc7/c;

    iget v3, p0, Lc7/n;->d:I

    iget v4, p0, Lc7/n;->e:I

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    invoke-static/range {v0 .. v6}, Lc7/r;->c(Landroidx/compose/ui/Modifier;Ljava/lang/String;Lc7/c;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
