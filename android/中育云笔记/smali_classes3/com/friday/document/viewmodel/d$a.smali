.class public final Lcom/friday/document/viewmodel/d$a;
.super Lcom/friday/document/viewmodel/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/friday/document/viewmodel/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final a:Lcom/friday/document/viewmodel/d$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/friday/document/viewmodel/d$a;

    invoke-direct {v0}, Lcom/friday/document/viewmodel/d$a;-><init>()V

    sput-object v0, Lcom/friday/document/viewmodel/d$a;->a:Lcom/friday/document/viewmodel/d$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0}, Lcom/friday/document/viewmodel/d;-><init>(Lkotlin/jvm/internal/n;)V

    .line 3
    .line 4
    .line 5
    return-void
.end method
