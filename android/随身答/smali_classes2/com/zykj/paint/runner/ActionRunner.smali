.class public abstract Lcom/zykj/paint/runner/ActionRunner;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field protected static final TAG:Ljava/lang/String; = "ActionRunner"


# instance fields
.field public ezyAction:Lcom/zykj/paint/Actions$EzyAction;

.field public map:Lcom/zykj/paint/graphic/Map;

.field public mapViewer:Lcom/zykj/paint/render/MapViewer;


# direct methods
.method public constructor <init>(Lcom/zykj/paint/render/MapViewer;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/zykj/paint/runner/ActionRunner;->mapViewer:Lcom/zykj/paint/render/MapViewer;

    .line 5
    .line 6
    iget-object p1, p1, Lcom/zykj/paint/render/MapViewer;->map:Lcom/zykj/paint/graphic/Map;

    .line 7
    .line 8
    iput-object p1, p0, Lcom/zykj/paint/runner/ActionRunner;->map:Lcom/zykj/paint/graphic/Map;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public abstract pause()V
.end method

.method public abstract resume()V
.end method

.method public abstract run(Lcom/zykj/paint/Actions$EzyAction;)V
.end method

.method public abstract stop()V
.end method
