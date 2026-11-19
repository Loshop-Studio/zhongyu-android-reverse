.class public final synthetic Lc5/e0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# instance fields
.field public final synthetic a:Lx7/l;

.field public final synthetic b:Landroidx/compose/runtime/MutableState;


# direct methods
.method public synthetic constructor <init>(Lx7/l;Landroidx/compose/runtime/MutableState;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc5/e0;->a:Lx7/l;

    iput-object p2, p0, Lc5/e0;->b:Landroidx/compose/runtime/MutableState;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lc5/e0;->a:Lx7/l;

    iget-object v1, p0, Lc5/e0;->b:Landroidx/compose/runtime/MutableState;

    check-cast p1, Landroidx/compose/foundation/text/KeyboardActionScope;

    invoke-static {v0, v1, p1}, Lc5/j0;->d(Lx7/l;Landroidx/compose/runtime/MutableState;Landroidx/compose/foundation/text/KeyboardActionScope;)Lh7/p;

    move-result-object p1

    return-object p1
.end method
