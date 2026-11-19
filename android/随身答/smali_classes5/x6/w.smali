.class public final synthetic Lx6/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Landroidx/compose/ui/focus/FocusManager;

.field public final synthetic b:Landroidx/compose/ui/platform/SoftwareKeyboardController;

.field public final synthetic c:Lkotlin/jvm/functions/Function1;

.field public final synthetic d:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/focus/FocusManager;Landroidx/compose/ui/platform/SoftwareKeyboardController;Lkotlin/jvm/functions/Function1;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx6/w;->a:Landroidx/compose/ui/focus/FocusManager;

    iput-object p2, p0, Lx6/w;->b:Landroidx/compose/ui/platform/SoftwareKeyboardController;

    iput-object p3, p0, Lx6/w;->c:Lkotlin/jvm/functions/Function1;

    iput-object p4, p0, Lx6/w;->d:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object v0, p0, Lx6/w;->a:Landroidx/compose/ui/focus/FocusManager;

    iget-object v1, p0, Lx6/w;->b:Landroidx/compose/ui/platform/SoftwareKeyboardController;

    iget-object v2, p0, Lx6/w;->c:Lkotlin/jvm/functions/Function1;

    iget-object v3, p0, Lx6/w;->d:Ljava/lang/String;

    check-cast p1, Landroidx/compose/foundation/text/KeyboardActionScope;

    invoke-static {v0, v1, v2, v3, p1}, Lx6/b0;->d(Landroidx/compose/ui/focus/FocusManager;Landroidx/compose/ui/platform/SoftwareKeyboardController;Lkotlin/jvm/functions/Function1;Ljava/lang/String;Landroidx/compose/foundation/text/KeyboardActionScope;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
