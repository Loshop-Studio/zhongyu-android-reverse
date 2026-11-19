.class public final synthetic Lx6/z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lkotlin/jvm/functions/Function1;

.field public final synthetic b:Landroidx/compose/ui/focus/FocusManager;

.field public final synthetic c:Landroidx/compose/ui/platform/SoftwareKeyboardController;

.field public final synthetic d:Lkotlin/jvm/functions/Function0;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/focus/FocusManager;Landroidx/compose/ui/platform/SoftwareKeyboardController;Lkotlin/jvm/functions/Function0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx6/z;->a:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Lx6/z;->b:Landroidx/compose/ui/focus/FocusManager;

    iput-object p3, p0, Lx6/z;->c:Landroidx/compose/ui/platform/SoftwareKeyboardController;

    iput-object p4, p0, Lx6/z;->d:Lkotlin/jvm/functions/Function0;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object v0, p0, Lx6/z;->a:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lx6/z;->b:Landroidx/compose/ui/focus/FocusManager;

    iget-object v2, p0, Lx6/z;->c:Landroidx/compose/ui/platform/SoftwareKeyboardController;

    iget-object v3, p0, Lx6/z;->d:Lkotlin/jvm/functions/Function0;

    invoke-static {v0, v1, v2, v3}, Lx6/b0;->b(Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/focus/FocusManager;Landroidx/compose/ui/platform/SoftwareKeyboardController;Lkotlin/jvm/functions/Function0;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
