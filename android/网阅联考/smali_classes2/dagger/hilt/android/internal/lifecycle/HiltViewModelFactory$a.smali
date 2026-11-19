.class public Ldagger/hilt/android/internal/lifecycle/HiltViewModelFactory$a;
.super Landroidx/lifecycle/AbstractSavedStateViewModelFactory;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ldagger/hilt/android/internal/lifecycle/HiltViewModelFactory;-><init>(Landroidx/savedstate/SavedStateRegistryOwner;Landroid/os/Bundle;Ljava/util/Set;Landroidx/lifecycle/ViewModelProvider$Factory;Lg2/c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lg2/c;

.field public final synthetic b:Ldagger/hilt/android/internal/lifecycle/HiltViewModelFactory;


# direct methods
.method public constructor <init>(Ldagger/hilt/android/internal/lifecycle/HiltViewModelFactory;Lg2/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ldagger/hilt/android/internal/lifecycle/HiltViewModelFactory$a;->b:Ldagger/hilt/android/internal/lifecycle/HiltViewModelFactory;

    .line 2
    .line 3
    iput-object p2, p0, Ldagger/hilt/android/internal/lifecycle/HiltViewModelFactory$a;->a:Lg2/c;

    .line 4
    .line 5
    invoke-direct {p0}, Landroidx/lifecycle/AbstractSavedStateViewModelFactory;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public create(Ljava/lang/String;Ljava/lang/Class;Landroidx/lifecycle/SavedStateHandle;)Landroidx/lifecycle/ViewModel;
    .locals 1

    .line 1
    new-instance p1, Lh2/d;

    .line 2
    .line 3
    invoke-direct {p1}, Lh2/d;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Ldagger/hilt/android/internal/lifecycle/HiltViewModelFactory$a;->a:Lg2/c;

    .line 7
    .line 8
    invoke-interface {v0, p3}, Lg2/c;->a(Landroidx/lifecycle/SavedStateHandle;)Lg2/c;

    .line 9
    .line 10
    .line 11
    move-result-object p3

    .line 12
    invoke-interface {p3, p1}, Lg2/c;->b(Ld2/c;)Lg2/c;

    .line 13
    .line 14
    .line 15
    move-result-object p3

    .line 16
    invoke-interface {p3}, Lg2/c;->build()Le2/c;

    .line 17
    .line 18
    .line 19
    move-result-object p3

    .line 20
    const-class v0, Ldagger/hilt/android/internal/lifecycle/HiltViewModelFactory$b;

    .line 21
    .line 22
    invoke-static {p3, v0}, Lc2/a;->a(Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p3

    .line 26
    check-cast p3, Ldagger/hilt/android/internal/lifecycle/HiltViewModelFactory$b;

    .line 27
    .line 28
    invoke-interface {p3}, Ldagger/hilt/android/internal/lifecycle/HiltViewModelFactory$b;->a()Ljava/util/Map;

    .line 29
    .line 30
    .line 31
    move-result-object p3

    .line 32
    invoke-virtual {p2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-interface {p3, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object p3

    .line 40
    check-cast p3, Lm2/a;

    .line 41
    .line 42
    if-eqz p3, :cond_0

    .line 43
    .line 44
    invoke-interface {p3}, Lm2/a;->get()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p2

    .line 48
    check-cast p2, Landroidx/lifecycle/ViewModel;

    .line 49
    .line 50
    new-instance p3, Lh2/c;

    .line 51
    .line 52
    invoke-direct {p3, p1}, Lh2/c;-><init>(Lh2/d;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p2, p3}, Landroidx/lifecycle/ViewModel;->addCloseable(Ljava/io/Closeable;)V

    .line 56
    .line 57
    .line 58
    return-object p2

    .line 59
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 60
    .line 61
    new-instance p3, Ljava/lang/StringBuilder;

    .line 62
    .line 63
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 64
    .line 65
    .line 66
    const-string v0, "Expected the @HiltViewModel-annotated class \'"

    .line 67
    .line 68
    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    invoke-virtual {p2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object p2

    .line 75
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    const-string p2, "\' to be available in the multi-binding of @HiltViewModelMap but none was found."

    .line 79
    .line 80
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object p2

    .line 87
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    throw p1
.end method
