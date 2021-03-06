package br.com.hossomi.kss.kafka.chat.consumer;

import org.apache.kafka.clients.consumer.ConsumerRecord;

public interface RecordListener<K, V> {
    void onRecord(ConsumerRecord<K, V> record);
}
