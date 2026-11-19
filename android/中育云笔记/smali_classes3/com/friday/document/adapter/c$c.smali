.class public final Lcom/friday/document/adapter/c$c;
.super Lcom/friday/document/adapter/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/friday/document/adapter/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# static fields
.field public static final b:Lcom/friday/document/adapter/c$c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/friday/document/adapter/c$c;

    invoke-direct {v0}, Lcom/friday/document/adapter/c$c;-><init>()V

    sput-object v0, Lcom/friday/document/adapter/c$c;->b:Lcom/friday/document/adapter/c$c;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    const-string v0, "\u6062\u590d"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {p0, v0, v1}, Lcom/friday/document/adapter/c;-><init>(Ljava/lang/String;Lkotlin/jvm/internal/n;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method
