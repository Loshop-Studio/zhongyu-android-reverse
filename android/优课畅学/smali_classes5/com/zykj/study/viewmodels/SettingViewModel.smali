.class public final Lcom/zykj/study/viewmodels/SettingViewModel;
.super Lcom/zykj/base/BaseViewModel;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation


# instance fields
.field public final a:Landroidx/databinding/ObservableField;

.field public final b:Landroidx/databinding/ObservableField;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 2
    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    .line 1
    invoke-direct {p0}, Lcom/zykj/base/BaseViewModel;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroidx/databinding/ObservableField;

    .line 5
    .line 6
    invoke-direct {v0}, Landroidx/databinding/ObservableField;-><init>()V

    .line 7
    .line 8
    .line 9
    const-string v1, "V1.1.3"

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Lcom/zykj/study/viewmodels/SettingViewModel;->a:Landroidx/databinding/ObservableField;

    .line 15
    .line 16
    new-instance v0, Landroidx/databinding/ObservableField;

    .line 17
    .line 18
    const-string v1, ""

    .line 19
    .line 20
    invoke-direct {v0, v1}, Landroidx/databinding/ObservableField;-><init>(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Lcom/zykj/study/viewmodels/SettingViewModel;->b:Landroidx/databinding/ObservableField;

    .line 24
    .line 25
    return-void
.end method


# virtual methods
.method public final a()Landroidx/databinding/ObservableField;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/viewmodels/SettingViewModel;->b:Landroidx/databinding/ObservableField;

    .line 2
    .line 3
    return-object v0
.end method

.method public final b()Landroidx/databinding/ObservableField;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/viewmodels/SettingViewModel;->a:Landroidx/databinding/ObservableField;

    .line 2
    .line 3
    return-object v0
.end method
