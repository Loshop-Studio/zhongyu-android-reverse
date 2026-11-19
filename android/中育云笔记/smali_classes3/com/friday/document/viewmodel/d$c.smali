.class public final Lcom/friday/document/viewmodel/d$c;
.super Lcom/friday/document/viewmodel/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/friday/document/viewmodel/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# static fields
.field public static final a:Lcom/friday/document/viewmodel/d$c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/friday/document/viewmodel/d$c;

    invoke-direct {v0}, Lcom/friday/document/viewmodel/d$c;-><init>()V

    sput-object v0, Lcom/friday/document/viewmodel/d$c;->a:Lcom/friday/document/viewmodel/d$c;

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
