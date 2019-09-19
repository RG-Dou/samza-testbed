package samzatask.twitter.model.classifier;

import org.apache.commons.lang.StringUtils;

/**
 *
 * @author mayconbordin
 */
public class SentimentResult {
    public static enum Sentiment {
        Positive, Negative, Neutral
    }
    
    private Sentiment sentiment;
    private double score;

    public SentimentResult() {
    }

    public SentimentResult(Sentiment sentiment) {
        this.sentiment = sentiment;
    }

    public SentimentResult(Sentiment sentiment, int score) {
        this.sentiment = sentiment;
        this.score = score;
    }

    public Sentiment getSentiment() {
        return sentiment;
    }

    public void setSentiment(Sentiment sentiment) {
        this.sentiment = sentiment;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        StringBuilder stateStr = new StringBuilder();
        stateStr.append("Sentiment: ").append(sentiment).append("; ");
        stateStr.append("Score: ").append(score).append("; ");
        return stateStr.toString();
    }
}
