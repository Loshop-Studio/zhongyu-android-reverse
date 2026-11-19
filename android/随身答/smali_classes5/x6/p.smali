.class public final synthetic Lx6/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:I

.field public final synthetic c:Lkotlin/jvm/functions/Function0;

.field public final synthetic d:I

.field public final synthetic e:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;ILkotlin/jvm/functions/Function0;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx6/p;->a:Ljava/lang/String;

    iput p2, p0, Lx6/p;->b:I

    iput-object p3, p0, Lx6/p;->c:Lkotlin/jvm/functions/Function0;

    iput p4, p0, Lx6/p;->d:I

    iput p5, p0, Lx6/p;->e:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-object v0, p0, Lx6/p;->a:Ljava/lang/String;

    iget v1, p0, Lx6/p;->b:I

    iget-object v2, p0, Lx6/p;->c:Lkotlin/jvm/functions/Function0;

    iget v3, p0, Lx6/p;->d:I

    iget v4, p0, Lx6/p;->e:I

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    invoke-static/range {v0 .. v6}, Lx6/q;->c(Ljava/lang/String;ILkotlin/jvm/functions/Function0;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
