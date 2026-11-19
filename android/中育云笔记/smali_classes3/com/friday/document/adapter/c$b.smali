.class public final Lcom/friday/document/adapter/c$b;
.super Lcom/friday/document/adapter/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/friday/document/adapter/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# static fields
.field public static final b:Lcom/friday/document/adapter/c$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/friday/document/adapter/c$b;

    invoke-direct {v0}, Lcom/friday/document/adapter/c$b;-><init>()V

    sput-object v0, Lcom/friday/document/adapter/c$b;->b:Lcom/friday/document/adapter/c$b;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    const-string v0, "\u5f7b\u5e95\u5220\u9664"

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
